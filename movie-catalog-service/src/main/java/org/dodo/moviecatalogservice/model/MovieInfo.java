package org.dodo.moviecatalogservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MovieInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private String path;

  public Long getId() {
    return id;
  }

  public MovieInfo setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public MovieInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public MovieInfo setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getPath() {
    return path;
  }

  public MovieInfo setPath(String path) {
    this.path = path;
    return this;
  }
}
