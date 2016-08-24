package com.tmem.repositories;


import com.tmem.entities.Actor;
import com.tmem.entities.Movie;
import com.tmem.entities.Studio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer>{
    @Query("select distinct m from Movie m join m.actors a where a.id = :id")
    public Page<Movie> findAllMoviesByActorId(@Param("id") int id, Pageable pageable);

    @Query("select distinct s from Movie m join m.actors a join m.studio s where a.id = :id")
    public Page<Studio> findAllStudiosByActorId(@Param("id") int id, Pageable pageable);
}
