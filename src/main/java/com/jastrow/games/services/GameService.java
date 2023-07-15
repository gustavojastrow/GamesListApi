package com.jastrow.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jastrow.games.dto.GameAllDto;
import com.jastrow.games.dto.GameDto;
import com.jastrow.games.entities.Game;
import com.jastrow.games.projections.GameMinProjection;
import com.jastrow.games.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true) 
    public GameAllDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameAllDto dto = new GameAllDto(result);
        return dto;
    }

    @Transactional(readOnly = true) 
    public List<GameDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameDto> dto = result.stream().map(x -> new GameDto(x)).toList();
        return dto;
    }
    @Transactional(readOnly = true) 
    public List<GameDto> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameDto(x)).toList();
    }
}
