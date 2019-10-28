package com.bookstore.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Game;

public interface GameRepository extends CrudRepository<Game, Long>{
	List<Game> findByCategory(String category);
	
	List<Game> findByTitleContaining(String title);
}
