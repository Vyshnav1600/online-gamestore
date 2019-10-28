
package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.CartItem;
import com.adminportal.domain.Game;
import com.adminportal.domain.Order;
import com.adminportal.domain.ShoppingCart;
import com.adminportal.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addGameToCartItem(Game game, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	static List<CartItem> findByOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
}
