package org.dodo.moviecatalogservice.controller;

import java.util.List;
import java.util.Optional;
import org.dodo.moviecatalogservice.model.MovieInfo;
import org.dodo.moviecatalogservice.repository.MovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

  @Autowired
  private MovieInfoRepository repository;

  @PostMapping("/save")
  public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList) {
    return repository.saveAll(movieInfoList);
  }

  @GetMapping("/list")
  public List<MovieInfo> getAll() {
    return repository.findAll();
  }

  @GetMapping("/find-path-by-id/{movieId}")
  public String findPathById(@PathVariable Long movieId) {

    Optional<MovieInfo> movieInfo = repository.findById(movieId);
    return movieInfo.map(MovieInfo::getPath).orElse(null);
  }


}
