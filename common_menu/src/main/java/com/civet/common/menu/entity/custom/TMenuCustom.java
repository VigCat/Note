package com.civet.common.menu.entity.custom;

import java.util.List;

import com.civet.common.menu.entity.TMenu;

/**
 * @author ChengJun
 * @date 2017-02-23 上午11:04:44
 *
 */
public class TMenuCustom {

	private TMenu TMenu;

	private List<TMenu> ItemList;

	public TMenu getMenu() {
		return TMenu;
	}

	public void setMenu(TMenu TMenu) {
		this.TMenu = TMenu;
	}

	public List<TMenu> getItemList() {
		return ItemList;
	}

	public void setItemList(List<TMenu> itemList) {
		ItemList = itemList;
	}
}
