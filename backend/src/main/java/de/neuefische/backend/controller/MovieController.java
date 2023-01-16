package de.neuefische.backend.controller;


import de.neuefische.backend.model.Movie;
import de.neuefische.backend.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        return movieService.create(movie);
    }
}