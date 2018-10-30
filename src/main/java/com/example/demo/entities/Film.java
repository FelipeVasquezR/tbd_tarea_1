package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "film")
public class Film implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="film_id", unique=true, nullable=false)
	private Long filmId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private String year;
	
	@Column(name="language_id")
	private String language_Id;
	
	@Column(name="original_language_id")
	private String original_language_id;
	
	@Column(name="rental_duration")
	private String rental_duration;
	
	@Column(name="rental_rate")
	private String rental_rate;
	
	@Column(name="length")
	private String length;
	
	@Column(name="replacement_cost")
	private String replacement_cost;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="special_features")
	private String special_features;
	
	@Column(name="last_update")
	private String last_update;
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "film")
    private List<FilmActor> filmActor;
	
	public Film() {
	}

	public Long getFilmId() {
		return filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getLanguage_Id() {
		return language_Id;
	}

	public void setLanguage_Id(String language_Id) {
		this.language_Id = language_Id;
	}

	public String getOriginal_language_id() {
		return original_language_id;
	}

	public void setOriginal_language_id(String original_language_id) {
		this.original_language_id = original_language_id;
	}

	public String getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(String rental_duration) {
		this.rental_duration = rental_duration;
	}

	public String getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(String rental_rate) {
		this.rental_rate = rental_rate;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(String replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecial_features() {
		return special_features;
	}

	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	public List<FilmActor> getFilmActor() {
		return filmActor;
	}

	public void setFilmActor(List<FilmActor> filmActor) {
		this.filmActor = filmActor;
	}

	
	
}
