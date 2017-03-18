package com.civet.common.menu.dao.custom;

import java.util.List;

import com.civet.common.menu.dao.MenuMapper;
import com.civet.common.menu.entity.Menu;

/** 
 * @author ChengJun 
 * @date 2017-02-23 上午11:02:01
 *
 */
public interface MenuMapperCustom extends MenuMapper{

	/**
	 * @return
	 */
	List<Menu> selectAll();
	
}
