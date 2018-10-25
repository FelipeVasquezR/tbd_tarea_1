package com.example.demo.controlador;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.*;
import com.example.demo.rest.IService;

@CrossOrigin
@RestController
@RequestMapping
public class ControladorFilmActor implements Serializable {

	@Autowired
	private IService capaServicio;

	// @CrossOrigin
	// @GetMapping
	// @Transactional
	// public List<FilmActor> index() {
	// return capaServicio.findAllFilmActor();
	// }

	// @Transactional
	// @GetMapping("/asdf")
	// public List<FilmActor> showAll() {
	// return capaServicio.findAllFilmActor();
	// }

	// @GetMapping("/{actor_id}/{film_id}")
	// public List<FilmActor> findFilmActorById(@PathVariable Long actor_id,
	// @PathVariable Long film_id) {
	// return capaServicio.encontrarKeys(film_id, actor_id);
	// }

	@CrossOrigin
	@PostMapping("/actors/{actor_id}/films/{film_id}")
	public HttpStatus vincular(@PathVariable("actor_id") Long actor_id, @PathVariable("film_id") Long film_id) {
		// Existe actor, pelicula?
		if (capaServicio.findActorById(actor_id) != null && capaServicio.findFilmById(film_id) != null) {
			// Existen las 2
			// Existe la relacion entre ellas
			if (capaServicio.encontrarKeys(film_id, actor_id).isEmpty() != true) {
				return HttpStatus.BAD_REQUEST;
			} else {
				// Crear relacion
				FilmActor filmActor = new FilmActor();
				filmActor.setActorId(actor_id);
				filmActor.setFilmId(film_id);
				filmActor.setLast_update(null);
				capaServicio.saveActorFilm1(filmActor);
				return HttpStatus.OK;
			}
		} else {
			return HttpStatus.BAD_REQUEST;
		}
	}

	@CrossOrigin
	@PostMapping("/films/{film_id}/actors/{actor_id}")
	public HttpStatus vincular2(@PathVariable("actor_id") Long actor_id, @PathVariable("film_id") Long film_id) {
		// Existe actor, pelicula?
		if (capaServicio.findActorById(actor_id) != null && capaServicio.findFilmById(film_id) != null) {
			// Existen las 2
			// Existe la relacion entre ellas
			if (capaServicio.encontrarKeys(film_id, actor_id).isEmpty() != true) {
				return HttpStatus.BAD_REQUEST;
			} else {
				// Crear relacion
				FilmActor filmActor = new FilmActor();
				filmActor.setActorId(actor_id);
				filmActor.setFilmId(film_id);
				filmActor.setLast_update(null);
				capaServicio.saveActorFilm1(filmActor);
				return HttpStatus.BAD_REQUEST;
			}
		} else {
			return HttpStatus.BAD_REQUEST;
		}
	}

}
