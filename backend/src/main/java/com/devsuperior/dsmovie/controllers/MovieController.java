package com.devsuperior.dsmovie.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController implements Serializable {

	private static final long serialVersionUID = -7225164318143053786L;

	@Autowired
	private MovieService movieService;

	@GetMapping
	public Page<MovieDto> findAll(Pageable pageable) {
		return movieService.findAll(pageable);
	}
	
	@GetMapping(value="/{id}")
	public MovieDto findById(@PathVariable Long id) {
		return movieService.findById(id);
	}

}
