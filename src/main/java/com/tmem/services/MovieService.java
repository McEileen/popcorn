package com.tmem.services;

import com.sun.tools.javac.util.List;
import com.tmem.entities.Movie;
import com.tmem.entities.Studio;
import com.tmem.enums.Rating;
import com.tmem.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private IMovieRepository repository;

    @Autowired
    public void setRepository(IMovieRepository repository) {
        this.repository = repository;
    }

    public Page<Movie> findAll(int page) {
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAll(pr);
    }

    public Movie findOne(int id) {
        return this.repository.findOne(id);
    }

    public Movie create(Movie m) {
        return this.repository.save(m);
    }

    public void destroy(int id) {
        this.repository.delete(id);
    }

    public List<Movie> findByRatingOrderByReleasedDesc(Rating rating){
        return re
    }
}