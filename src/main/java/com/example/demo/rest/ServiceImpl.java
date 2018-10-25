package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.*;
import com.example.demo.repository.*;


@Service
public class ServiceImpl implements IService{

	
	@Autowired
	private ActorRepository actorDao;
	
	@Autowired
	private FilmRepository filmDao;
	
	@Autowired
	private FilmActorRepository filmActorDao;
	
	//ACTOR
	
	@Override
	@Transactional
	public List<Actor> findAllActor() {
		return (List<Actor>) actorDao.findAll();
	}
	
	@Override
	@Transactional
	public Actor findActorById(Long id) {
		return actorDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Actor resource) {
		actorDao.save(resource);
		
	}

	@Override
	@Transactional
	public List<Actor> encontrarActorPorFilm(Long id) {
		return actorDao.encontrarActorPorFilm(id);
	}
	
	//FILM
	
	@Override
	@Transactional
	public List<Film> findAllFilm() {
		return (List<Film>) filmDao.findAll();
	}
	
	@Override
	@Transactional
	public Film findFilmById(Long id){
		return filmDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public List<Film> encontrarFilmPorActor(Long id) {
		return filmDao.encontrarFilmPorActor(id);
	}
	
	//FILM ACTOR
	
	@Override
	@Transactional
	public List<FilmActor> findAllFilmActor() {
		return (List<FilmActor>) filmActorDao.findAll();
	}


	@Override
	@Transactional
	public List<FilmActor> findAll() {
		return (List<FilmActor>) filmActorDao.findAll();
	}
	@Transactional
	public void saveActorFilm1(FilmActor resource) {
		filmActorDao.save(resource);
	}

	@Override
	@Transactional
	public List<FilmActor> encontrarKeys(Long film_id, Long actor_id) {
		return filmActorDao.encontrarKeys(film_id, actor_id);
	}
	
	

	


}
