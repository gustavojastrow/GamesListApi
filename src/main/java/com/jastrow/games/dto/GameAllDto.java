package com.jastrow.games.dto;

import org.springframework.beans.BeanUtils;

import com.jastrow.games.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class GameAllDto {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameAllDto(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
}
