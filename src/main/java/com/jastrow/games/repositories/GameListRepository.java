package com.jastrow.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jastrow.games.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {
    
}
