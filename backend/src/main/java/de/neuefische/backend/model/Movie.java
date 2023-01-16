package de.neuefische.backend.model;

import lombok.Data;

@Data
public class Movie {
    private final String id;
    private final String title;
    private final String posterUrl;
    private final String year;


}
