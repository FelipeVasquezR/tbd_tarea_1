package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@IdClass(FilmActorId.class)
@Table(name = "film_actor")
public class FilmActor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "film_id")
	private Long filmId;

	@Id
	@Column(name = "actor_id")
	private Long actorId;

	@Column(name = "last_update", nullable = true)
	private Timestamp last_update;

	@ManyToOne
	@JoinColumn(name = "film_id", referencedColumnName = "film_id", insertable = false, updatable = false)
	private Film film;

	@ManyToOne
	@JoinColumn(name = "actor_id", referencedColumnName = "actor_id", insertable = false, updatable = false)

	private Actor actor;

	public FilmActor() {
	}

	public FilmActor(Long actor_id, Long film_id) {
		this.filmId = film_id;
		this.actorId = actor_id;
		this.last_update = null;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	public Long getFilmId() {
		return filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

	public Long getActorId() {
		return actorId;
	}

	public void setActorId(Long actorsId) {
		this.actorId = actorsId;
	}

}
