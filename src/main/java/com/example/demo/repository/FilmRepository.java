package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Film;
import com.example.demo.entities.FilmActor;

public interface FilmRepository extends JpaRepository<Film, Long>{
	
	@Query(value = "SELECT * FROM film WHERE film_id IN (SELECT film_id FROM film_actor WHERE actor_id = ?1)", nativeQuery = true)
	List<Film> encontrarFilmPorActor(Long id);
	
}
