package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public Page<MovieDto> findAll(Pageable pageable) {
		Page<Movie> result = this.movieRepository.findAll(pageable);
		Page<MovieDto> pages = result.map(x -> new MovieDto(x));
		return pages;
	}

	@Transactional(readOnly = true)
	public MovieDto findById(Long id) {
		Movie movie = this.movieRepository.findById(id).get();
		MovieDto movieDto = new MovieDto(movie);
		return movieDto;
	}

}
