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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Actor;
import com.example.demo.entities.Film;
import com.example.demo.entities.FilmActor;
import com.example.demo.rest.IService;

@CrossOrigin
@RestController
@RequestMapping("/actors")
public class ControladorActor implements Serializable {
	//
	@Autowired
	private IService capaServicio;

	@CrossOrigin
	@GetMapping
	@Transactional
	public List<Actor> index() {
		return capaServicio.findAllActor();
	}

	@GetMapping("/{id}")
	public Actor findActorById(@PathVariable Long id) {
		return capaServicio.findActorById(id);
	}

	@GetMapping("/{id}/films")
	public List<Film> encontrarActorPorFilm(@PathVariable Long id) {
		return capaServicio.encontrarFilmPorActor(id);
	}
	
	//@Transactional
	@PostMapping
	public HttpStatus save(@RequestBody Actor actor) {
		
			capaServicio.save(actor);
			return HttpStatus.OK;

		
	}
	//
	// @GetMapping("/actor/{id}/film")
	// public List<FilmActor> encontrarFilmPorActor(@PathVariable Long id) {
	// return capaServicio.encontrarFilmPorActor(id);
	// }

}
