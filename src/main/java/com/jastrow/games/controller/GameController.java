package com.jastrow.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jastrow.games.dto.GameAllDto;
import com.jastrow.games.dto.GameDto;
import com.jastrow.games.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDto> findAll(){
        List<GameDto> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameAllDto findById(@PathVariable Long id){
        GameAllDto result = gameService.findById(id);
        return result;
    }

    
}
