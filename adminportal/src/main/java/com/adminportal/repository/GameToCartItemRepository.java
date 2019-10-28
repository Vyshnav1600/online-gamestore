package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.adminportal.domain.CartItem;
import com.adminportal.domain.GameToCartItem;

@Transactional
public interface GameToCartItemRepository extends CrudRepository<GameToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
