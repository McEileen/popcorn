package com.tmem.repositories;

import com.sun.tools.javac.util.List;
import com.tmem.entities.Movie;
import com.tmem.enums.Rating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IMovieRepository extends PagingAndSortingRepository<Movie, Integer>{
    public List<Movie> findByRatingOrderByReleasedDesc(Rating rating);
}
