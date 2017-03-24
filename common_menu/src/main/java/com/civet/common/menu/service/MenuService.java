package com.civet.common.menu.service;

import java.util.List;

import com.civet.common.menu.entity.TMenu;

/**
 * @author ChengJun
 * @date 2017-02-23 上午10:46:33
 *
 */
public interface MenuService {
	List<TMenu> selectAll();

	/**
	 * @return
	 */
	List<TMenu> selectByParentId(String id);
}
