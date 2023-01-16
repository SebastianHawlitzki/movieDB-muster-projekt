package de.neuefische.backend.service;


import de.neuefische.backend.model.Movie;
import de.neuefische.backend.repo.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }
}