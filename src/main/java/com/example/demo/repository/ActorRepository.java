package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Actor;
import com.example.demo.entities.Film;
import com.example.demo.entities.FilmActor;

public interface ActorRepository extends JpaRepository<Actor, Long>{
	
	@Query(value = "SELECT * FROM actor WHERE actor_id IN(SELECT actor_id FROM film_actor WHERE film_id = ?)", nativeQuery = true)
	List<Actor> encontrarActorPorFilm(Long id);
}
