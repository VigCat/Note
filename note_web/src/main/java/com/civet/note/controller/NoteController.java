package com.civet.note.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.civet.note.entity.TNote;
import com.civet.note.service.NoteService;
import com.civet.util.Util;

import common_uitl.DateUtil;

/**
 * @author ChengJun
 * @date 2017-02-20 下午9:06:02
 *
 */
@Controller
@RequestMapping(value = "/note")
public class NoteController {

	@Resource
	private NoteService service;

	@RequestMapping("/selectAll")
	public @ResponseBody List<TNote> getNoteList() {
		List<TNote> noteList = service.selectAll();
		return noteList;
	}

	@SuppressWarnings("finally")
	@RequestMapping("/selectById")
	public @ResponseBody Map<String, Object> selectById(Model model, String id) {
		TNote note = service.selectByPrimaryKey(id);
		String content = "";
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			content = Util.readFileByByte64(note.getUrl(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
			content = "<span style='background-color:#ccc;padding:50px;margin:50px;' >哎呀！文章找不到了~</span>";
		} finally {
			result.put("note", note);
			result.put("content", content);
			return result;
		}
	}

	@RequestMapping("/selectByParentID")
	public @ResponseBody List<TNote> selectByParentId(int menuID) {
		List<TNote> note = service.selectByParentId(menuID);
		return note;
	}

	@Transactional
	@RequestMapping("/saveNote")
	public @ResponseBody TNote saveNote(HttpServletRequest req, TNote note, String content) {
		String fileName = "e:civet\\note\\user\\source\\" + DateUtil.getUserDate("yyyyMM") + "\\" + Util.getDateTimeString() + ".civet";
		// String fileName = req.getServletContext().getRealPath("/") +
		// "resource\\user\\" + DateUtil.getUserDate("yyyyMM") + "\\" +
		// Util.getDateTimeString() + ".civet";
		// && !"null".equals(note.getId()) && null != note.getId()
		if (!"".equals(note.getId())&&null!=note.getId()) {
			//fileName = note.getUrl() + "_u";
			note.setUrl(fileName);
			
			service.updateByPrimaryKeySelective(note);// (note.getId(),note);
		} else {
			note.setUrl(fileName);
			//note.setCreatetime(DateUtil.getStringDate());
			note.setId(Util.getDateTimeString());
			service.insert(note);
		}
		System.out.println(fileName);
		Util.createFile(fileName);
		Util.writeFile(fileName, content, false);
		return note;
	}

	@RequestMapping("/delNoteById")
	public @ResponseBody String delNoteById(String id) {
		if (service.deleteByPrimaryKey(id) > 0) {
			return "suceess";
		} else {
			return "error";
		}
	}

	public String getProperties(String key) {
		Properties pop = new Properties();
		try {
			pop.load(new FileInputStream("classpath:a.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pop.getProperty(key);
	}
}
