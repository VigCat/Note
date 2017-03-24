package com.civet.common.menu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.civet.common.menu.entity.TMenu;
import com.civet.common.menu.service.MenuService;

/** 
 * @author ChengJun 
 * @date 2017-02-23 上午10:57:30
 *
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

	@Resource
	private MenuService service;
	
	@RequestMapping("/selectAll")
	public @ResponseBody List<TMenu> selectAll(Model model){
		return service.selectAll();
	}
	
	@RequestMapping("/selectByParentId")
	public @ResponseBody List<TMenu> selectByParentId(String id){
		return service.selectByParentId(id);
	}  
}
