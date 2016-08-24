package com.tmem.services;

import com.tmem.entities.Actor;
import com.tmem.entities.Movie;
import com.tmem.entities.Studio;
import com.tmem.repositories.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ActorService {
    private IActorRepository repository;

    @Autowired
    public void setRepository(IActorRepository repository) {
        this.repository = repository;
    }

    public Page<Actor> findAll(int page) {
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAll(pr);
    }

    public Page<Studio> findAllStudiosByActorId(int id, int page) {
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAllStudiosByActorId(id, pr);
    }

    public Page<Movie> findAllMoviesByActorId(int actor_id, int page) {
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAllMoviesByActorId(actor_id, pr);
    }

    public Actor findOne(int id) {
        return this.repository.findOne(id);
    }

    public Actor create(Actor a) {
        return this.repository.save(a);
    }

    public void destroy(int id) {
        this.repository.delete(id);
    }
}
