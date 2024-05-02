package org.dodo.moviestreamingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieCatalogService {

  public static final String CATALOG_SERVICE_URL = "http://movie-catalog-service";

  @Autowired
  private RestTemplate restTemplate;

  public String getMoviePath(Long movieId) {
    return restTemplate.getForEntity(
            CATALOG_SERVICE_URL + "/movie-info/find-path-by-id/{movieId}", String.class, movieId)
        .getBody();
  }


}
