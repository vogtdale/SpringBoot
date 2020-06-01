package com.meetup.Controller;

import com.meetup.Model.Genre;
import com.meetup.Services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GenreController {
    GenreService genreService;

    @Autowired
    public GenreController(final GenreService genreService) {
        this.genreService = genreService;
    }


    /*******************************************************
     *                      List of Genres
     *******************************************************/
    @GetMapping("/genre")
    public List<Genre> showGenre() {
        return this.genreService.findAll();
    }

    @GetMapping("/genre/{id}")
    public Genre getEvt(@PathVariable int id) {
        return this.genreService.findbyId(id);
    }


    /*******************************************************
     *                     Add Genres
     *******************************************************/
    @PutMapping("/addGenre")
    public Genre addUsers(@RequestBody Genre genre) {
        return this.genreService.save(genre);
    }

    /******************************************************
     *                      Delete Genres
     *******************************************************/

    @DeleteMapping("/genre/{id}")
    public void delete(@PathVariable int id) {
        this.genreService.delete(id);
    }


}
