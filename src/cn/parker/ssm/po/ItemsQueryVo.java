package cn.parker.ssm.po;

import java.util.List;

public class ItemsQueryVo {
	private Items items;
	private ItemsCustom itemsCustom;
	private List<ItemsCustom> edititemsList;
	
	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}
	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public List<ItemsCustom> getEdititemsList() {
		return edititemsList;
	}
	public void setEdititemsList(List<ItemsCustom> edititemsList) {
		this.edititemsList = edititemsList;
	}
	
}
