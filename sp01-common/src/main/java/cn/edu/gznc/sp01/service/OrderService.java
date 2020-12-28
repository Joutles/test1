package cn.edu.gznc.sp01.service;

import cn.edu.gznc.sp01.entity.Order;

public interface OrderService {

	Order getOrder(String orderId);

	void addOrder(Order order); // 增加订单
}
