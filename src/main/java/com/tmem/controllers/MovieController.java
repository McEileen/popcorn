package com.tmem.controllers;

import com.tmem.entities.Movie;
import com.tmem.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MovieController {
    private MovieService service;

    @Autowired
    public void setService(MovieService service) {
        this.service = service;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Page<Movie> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page) {
        return this.service.findAll(page);
    }

    @RequestMapping(path = {"/{id}"}, method = RequestMethod.GET)
    public Movie show(@PathVariable int id) {
        return this.service.findOne(id);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Movie create(@RequestBody Movie movie) {
        return this.service.create(movie);
    }

    @RequestMapping(path = {"/{id}"}, method = RequestMethod.DELETE)
    public void destroy(@PathVariable int id) {
        this.service.destroy(id);
    }

}