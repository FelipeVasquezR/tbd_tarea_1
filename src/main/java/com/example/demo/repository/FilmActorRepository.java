package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.*;

public interface FilmActorRepository extends JpaRepository<FilmActor, Long>{

	@Query(value = "SELECT * FROM film_actor WHERE film_id=?1 AND actor_id = ?2", nativeQuery = true)
	List<FilmActor> encontrarKeys(Long film_id, Long actor_id);
	
	
}
