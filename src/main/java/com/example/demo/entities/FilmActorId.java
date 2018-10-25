package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilmActorId implements Serializable{

	private Long filmId;
	
	private Long actorId;
	
}
