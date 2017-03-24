package com.civet.common.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.civet.common.menu.dao.custom.TMenuMapperCustom;
import com.civet.common.menu.entity.TMenu;
import com.civet.common.menu.service.MenuService;

/** 
 * @author ChengJun 
 * @date 2017-02-23 上午10:49:16
 *
 */
@Service
public class MenuServiceImpl implements MenuService{

	@Resource
	private TMenuMapperCustom dao;
	
	@Override
	public List<TMenu> selectAll() {
		return dao.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.civet.common.menu.service.MenuService#selectByParentId()
	 */
	@Override
	public List<TMenu> selectByParentId(String id) {
		return dao.selectByParentId(id);
	}

}
