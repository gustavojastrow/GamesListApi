package com.jastrow.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jastrow.games.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
    
}
