package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import com.bookstore.domain.GameToCartItem;
import com.bookstore.domain.CartItem;

@Transactional
public interface GameToCartItemRepository extends CrudRepository<GameToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
