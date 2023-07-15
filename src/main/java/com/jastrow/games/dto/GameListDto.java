package com.jastrow.games.dto;

import com.jastrow.games.entities.GameList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameListDto {
    private Long id;
    private String name;

    public GameListDto(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }
}
