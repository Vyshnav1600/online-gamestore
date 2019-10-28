package com.bookstore.service;

import java.util.List;


import com.bookstore.domain.Game;

public interface GameService {
	List<Game> findAll ();
	
	Game findOne(Long id);
	
	List<Game> findByCategory(String category);
	
	List<Game> blurrySearch(String title);
}
