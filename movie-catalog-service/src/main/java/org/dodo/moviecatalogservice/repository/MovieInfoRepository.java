package org.dodo.moviecatalogservice.repository;

import org.dodo.moviecatalogservice.model.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo,Long> {



}
