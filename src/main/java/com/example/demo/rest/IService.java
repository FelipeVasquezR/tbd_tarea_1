package com.example.demo.rest;

import java.util.List;

import com.example.demo.entities.Actor;
import com.example.demo.entities.Film;
import com.example.demo.entities.FilmActor;

public interface IService {
	
	

	public List <Actor> findAllActor();

	public Actor findActorById(Long id);

	public void save(Actor resource);
	
	public List<Actor> encontrarActorPorFilm(Long id);
//	public List<Actor> encontrarActorPorFilm(long id);

	
	//FILM
	
	public List<Film> findAllFilm();

	public Film findFilmById(Long id);

	
	public List<Film> encontrarFilmPorActor(Long id);

	
	//FILMACTOR
	public List<FilmActor> findAllFilmActor();

//	public List<Film> encontrarFilmPorActor(Long id);
	
	public List<FilmActor> encontrarKeys(Long film_id, Long actor_id);

	public List<FilmActor> findAll();
	
	public void saveActorFilm1(FilmActor filmActor);





}
