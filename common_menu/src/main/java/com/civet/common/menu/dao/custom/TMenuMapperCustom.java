package com.civet.common.menu.dao.custom;

import java.util.List;

import com.civet.common.menu.dao.TMenuMapper;
import com.civet.common.menu.entity.TMenu;

/** 
 * @author ChengJun 
 * @date 2017-02-23 上午11:02:01
 *
 */
public interface TMenuMapperCustom extends TMenuMapper{

	/**
	 * @return
	 */
	List<TMenu> selectAll();

	/**
	 * @param id
	 * @return
	 */
	List<TMenu> selectByParentId(String parentId);
	
}
