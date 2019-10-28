package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.BillingAddress;
import com.adminportal.domain.Game;
import com.adminportal.domain.Order;
import com.adminportal.domain.Payment;
import com.adminportal.domain.ShippingAddress;
import com.adminportal.domain.ShoppingCart;
import com.adminportal.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);

	List<Order> selectAll();
	
	public List<Order> getAllOrders();

	Order selectAll(Long orderId);
}
