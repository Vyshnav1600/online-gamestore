package com.bookstore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.Game;
import com.bookstore.repository.GameRepository;
import com.bookstore.service.GameService;

@Service
public class GameServiceImpl implements GameService{
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll() {
		List<Game> gameList = (List<Game>) gameRepository.findAll();
		List<Game> activeGameList = new ArrayList<>();
		
		for (Game game: gameList) {
			if(game.isActive()) {
				activeGameList.add(game);
			}
		}
		
		return activeGameList;
	}
	
	public Game findOne(Long id) {
		return gameRepository.findOne(id);
	}

	public List<Game> findByCategory(String category){
		List<Game> gameList = gameRepository.findByCategory(category);
		
		List<Game> activeGameList = new ArrayList<>();
		
		for (Game game: gameList) {
			if(game.isActive()) {
				activeGameList.add(game);
			}
		}
		
		return activeGameList;
	}
	
	public List<Game> blurrySearch(String title) {
		List<Game> gameList = gameRepository.findByTitleContaining(title);
List<Game> activeGameList = new ArrayList<>();
		
		for (Game game: gameList) {
			if(game.isActive()) {
				activeGameList.add(game);
			}
		}
		
		return activeGameList;
	}
}
