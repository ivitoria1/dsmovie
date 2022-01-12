package com.devsuperior.dsmovie.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.dto.ScoreDto;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;

@Service
public class ScoreService implements Serializable {

	private static final long serialVersionUID = -1293308067607934116L;

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ScoreRepository scoreRepository;

	@Transactional
	public MovieDto saveScore(ScoreDto scoreDto) {

		User user = userRepository.findByEmail(scoreDto.getEmail());

		if (user == null) {
			user = new User();
			user.setEmail(scoreDto.getEmail());
			user = userRepository.saveAndFlush(user);
		}

		Movie movie = movieRepository.findById(scoreDto.getMovieId()).get();

		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(scoreDto.getScore());
		score = scoreRepository.saveAndFlush(score);

		double sum = 0.0;

		for (Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}

		double avg = sum / movie.getScores().size();

		movie.setScore(avg);
		movie.setCount(movie.getScores().size());

		movie = movieRepository.save(movie);
		MovieDto movieDto = new MovieDto(movie);
		
		return movieDto;

	}

}
