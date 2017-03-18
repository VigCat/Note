package com.civet.common.menu.entity.custom;

import java.util.List;

import com.civet.common.menu.entity.Menu;

/**
 * @author ChengJun
 * @date 2017-02-23 上午11:04:44
 *
 */
public class MenuCustom {

	private Menu menu;

	private List<Menu> ItemList;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Menu> getItemList() {
		return ItemList;
	}

	public void setItemList(List<Menu> itemList) {
		ItemList = itemList;
	}
}
