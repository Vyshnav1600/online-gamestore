package com.gamestore.service;

import java.util.List;

import com.gamestore.domain.CartItem;
import com.gamestore.domain.Game;
import com.gamestore.domain.Order;
import com.gamestore.domain.ShoppingCart;
import com.gamestore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addGameToCartItem(Game game, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
