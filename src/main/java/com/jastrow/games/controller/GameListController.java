package com.jastrow.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jastrow.games.dto.GameDto;
import com.jastrow.games.dto.GameListDto;
import com.jastrow.games.services.GameListService;
import com.jastrow.games.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value="/{listId}/games")
    public List<GameDto> findByList(@PathVariable Long listId){
        List<GameDto> result = gameService.findByList(listId);
        return result;
    }

}
