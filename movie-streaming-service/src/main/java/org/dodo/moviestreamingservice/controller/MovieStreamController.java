package org.dodo.moviestreamingservice.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dodo.moviestreamingservice.service.MovieCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stream")
public class MovieStreamController {

public static final Logger log = Logger.getLogger(MovieStreamController.class.getName());
  public static final String VIDEO_DIRECTORY = "D:\\test video app\\";

  @Autowired
  private MovieCatalogService movieCatalogService;

  @GetMapping("/{videoPath}")
  public ResponseEntity<InputStreamResource> streamVideo(@PathVariable String videoPath)
      throws FileNotFoundException {

    File file = new File(VIDEO_DIRECTORY + videoPath);
    if (file.exists()) {
      InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
      return ResponseEntity.ok()
          .contentType(MediaType.parseMediaType("video/mp4"))
          .body(inputStreamResource);

    } else {
     return ResponseEntity.notFound().build();
    }

  }

  @GetMapping("/with-id/{videoId}")
  public ResponseEntity<InputStreamResource> streamVideoWithId(@PathVariable Long videoId)
      throws FileNotFoundException {
    String videoPath = movieCatalogService.getMoviePath(videoId);
log.log(Level.INFO, "Video Path: " + videoPath);
    return streamVideo(videoPath);
  }



}
