package com.jastrow.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jastrow.games.dto.GameDto;
import com.jastrow.games.entities.Game;
import com.jastrow.games.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<GameDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameDto> dto = result.stream().map(x -> new GameDto(x)).toList();
        return dto;
    }
}
