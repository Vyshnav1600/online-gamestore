package com.adminportal.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.BillingAddress;
import com.adminportal.domain.CartItem;
import com.adminportal.domain.Game;
import com.adminportal.domain.Order;
import com.adminportal.domain.Payment;
import com.adminportal.domain.ShippingAddress;
import com.adminportal.domain.ShoppingCart;
import com.adminportal.domain.User;
import com.adminportal.repository.OrderRepository;
import com.adminportal.service.CartItemService;
import com.adminportal.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartItemService cartItemService;
	
	public synchronized Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user) {
		Order order = new Order();
		order.setBillingAddress(billingAddress);
		order.setOrderStatus("created");
		order.setPayment(payment);
		order.setShippingAddress(shippingAddress);
		order.setShippingMethod(shippingMethod);
		
		List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
		
		for(CartItem cartItem : cartItemList) {
			Game game = cartItem.getGame();
			cartItem.setOrder(order);
			game.setInStockNumber(game.getInStockNumber() - cartItem.getQty());
		}
		
		order.setCartItemList(cartItemList);
		order.setOrderDate(Calendar.getInstance().getTime());
		order.setOrderTotal(shoppingCart.getGrandTotal());
		shippingAddress.setOrder(order);
		billingAddress.setOrder(order);
		payment.setOrder(order);
		order.setUser(user);
		order = orderRepository.save(order);
		
		return order;
	}
	
	public Order findOne(Long id) {
		return orderRepository.findOne(id);
	}

	@Override
	public List<Order> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	 public List<Order> getAllOrders() {
	  return (List<Order>) orderRepository.findAll();
	 }
	
	@Override
	public Order selectAll(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
