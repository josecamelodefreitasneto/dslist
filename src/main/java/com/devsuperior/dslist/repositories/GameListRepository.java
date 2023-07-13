package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	// esse é  a camada de acesso a banco de dados

}
