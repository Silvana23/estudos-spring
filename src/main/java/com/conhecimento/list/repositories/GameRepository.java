package com.conhecimento.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conhecimento.list.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long>{

}
