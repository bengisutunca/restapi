package com.tunca.mongodbrestapi.repository;

import com.tunca.mongodbrestapi.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
    Movie findMovieById(String movieId);
}
