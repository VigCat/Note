package com.civet.common.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.civet.common.menu.dao.custom.MenuMapperCustom;
import com.civet.common.menu.entity.Menu;
import com.civet.common.menu.service.MenuService;

/** 
 * @author ChengJun 
 * @date 2017-02-23 上午10:49:16
 *
 */
@Service
public class MenuServiceImpl implements MenuService{

	@Resource
	private MenuMapperCustom dao;
	
	@Override
	public List<Menu> selectAll() {
		return dao.selectAll();
	}

}
