package com.example.demo.controlador;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Actor;
import com.example.demo.entities.Film;
import com.example.demo.entities.FilmActor;
import com.example.demo.rest.IService;

@RestController
@RequestMapping("/films")
public class ControladorFilm implements Serializable {

	@Autowired
	private IService capaServicio;

	@CrossOrigin
	@GetMapping
	public List<Film> index() {
		return capaServicio.findAllFilm();
	}

	@GetMapping("/{id}")
	public Film findActorById(@PathVariable Long id) {
		return capaServicio.findFilmById(id);
	}

	@GetMapping("/{id}/actor")
	public List<Actor> encontrarFilmPorActor(@PathVariable Long id) {
		return capaServicio.encontrarActorPorFilm(id);
	}

}
