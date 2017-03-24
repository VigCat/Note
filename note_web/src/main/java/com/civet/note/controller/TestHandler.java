package com.civet.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.civet.note.entity.TNote;
import com.civet.note.service.NoteService;

/***
 * 
 * @author ChengJun 
 * @date 2017-02-20 下午8:58:50
 *
 */
@Controller
@RequestMapping(value = "/a") // 这个要使用组件扫描
public class TestHandler {

	@Autowired
	private NoteService service;

	@RequestMapping("/insert")
	public String insertHandler(Model models, TNote note) {
		// 调用service 做业务实现
//		int count = service.insert(note);
//		models.addAttribute("count", count);
		return "/page/index.jsp";
	}

	@RequestMapping("/selectById")
	public String selectByIdHandler(Model model, String id) {
		// 调用service 做业务实现
//		Note note = service.selectByPrimaryKey(id);
//		model.addAttribute("note", note);
		return "/page/index.jsp";
	}

	@RequestMapping("/selectAll")
	public String selectAllHandler(Model model) {
		// 调用service 做业务实现
//		List<Note> noteList = service.selectAll();
//		model.addAttribute("list", noteList);
		return "/page/index.jsp";
	}

	@RequestMapping("/selectByPage")
	public String selectByPageHandler(Model model) {
		// 调用service 做业务实现
//		List<Note> noteList = service.selectAll();
//		model.addAttribute("list", noteList);
		return "/page/index.jsp";
	}

	@RequestMapping("/update")
	public String updateHandler(Model model, TNote note) {
		// 调用service 做业务实现
//		int count = service.updateByPrimaryKey(note);
//		model.addAttribute("list", count);
		return "/page/index.jsp";
	}

	@RequestMapping("/delete")
	public String deleteHandler(Model model, String id) {
		// 调用service 做业务实现
		int count = service.deleteByPrimaryKey(id);
		model.addAttribute("count", count);
		return "/page/index.jsp";
	}

	@RequestMapping("/deleteList")
	public String deleteListHandler(Model model, String id) {
		// 调用service 做业务实现
		int count = service.deleteByPrimaryKey(id);
		model.addAttribute("count", count);
		// 这里不加/的话这里就会定位到test/xxx.jsp之下
		return "/page/index.jsp";
	}

}
