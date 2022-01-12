package com.devsuperior.dsmovie.dto;

import java.io.Serializable;

public class ScoreDto implements Serializable {

	private static final long serialVersionUID = -4341456983532538039L;

	private Long movieId;

	private String email;

	private Double score;

	public ScoreDto() {
		// TODO Auto-generated constructor stub
	}

	public ScoreDto(Long movieId, String email, Double score) {
		super();
		this.movieId = movieId;
		this.email = email;
		this.score = score;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
