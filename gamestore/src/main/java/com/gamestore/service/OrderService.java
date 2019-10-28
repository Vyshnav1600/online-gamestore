package com.gamestore.service;

import com.gamestore.domain.BillingAddress;
import com.gamestore.domain.Order;
import com.gamestore.domain.Payment;
import com.gamestore.domain.ShippingAddress;
import com.gamestore.domain.ShoppingCart;
import com.gamestore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
