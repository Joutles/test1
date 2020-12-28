package cn.edu.gznc.sp01.service;

import java.util.List;

import cn.edu.gznc.sp01.entity.Item;

public interface ItemService {
	
	List<Item> getItems(String orderId);

	void decreaseNumbers(List<Item> list); // 减少库存
}
