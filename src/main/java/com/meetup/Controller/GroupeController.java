package com.meetup.Controller;

import com.meetup.Model.Groupe;
import com.meetup.Services.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GroupeController {
    GroupeService groupeService;

    @Autowired
    public GroupeController(final GroupeService groupeService) {
        this.groupeService = groupeService;
    }


    /*******************************************************
     *                      List of Groupe
     *******************************************************/
    @GetMapping("/groupe")
    public List<Groupe> showGroupe() {
        return this.groupeService.findAll();
    }

    @GetMapping("/groupe/{id}")
    public Groupe getGroupes(@PathVariable int id) {
        return this.groupeService.findGroupes(id);
    }


    /*******************************************************
     *                     Add Groupe
     *******************************************************/
    @PutMapping("/addGroupe")
    public Groupe addUsers(@RequestBody Groupe groupe) {
        return this.groupeService.save(groupe);
    }

    /******************************************************
     *                      Delete Groupe
     *******************************************************/

    @DeleteMapping("/groupe/{id}")
    public void delete(@PathVariable int id) {
        this.groupeService.delete(id);
    }


}