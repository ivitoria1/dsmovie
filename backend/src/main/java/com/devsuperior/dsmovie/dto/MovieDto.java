package com.devsuperior.dsmovie.dto;

import java.io.Serializable;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDto implements Serializable {

	private static final long serialVersionUID = 1281944948555012688L;

	private Long id;

	private String title;

	private Double score;

	private Integer count;

	private String image;

	public MovieDto() {
		// TODO Auto-generated constructor stub
	}

	public MovieDto(Long id, String title, Double score, Integer count, String image) {
		super();
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDto(Movie movie) {
		this.id = movie.getId();
		this.title = movie.getTitle();
		this.score = movie.getScore();
		this.count = movie.getCount();
		this.image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
