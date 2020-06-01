package com.meetup.Controller;

import com.meetup.Dao.UserRepository;
import com.meetup.Model.PersonneModel;
import com.meetup.Services.PersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MeetupController {
    PersService persService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    public MeetupController(final PersService persService) {
        this.persService = persService;
    }


    @GetMapping("/")
    public String hompePage() {
        return "Welcome to meetUpz";
    }

    /*******************************************************
     *                      List of Users
     *******************************************************/
    @GetMapping("/user")
    public List<PersonneModel> showUsers() {
        return this.persService.findAll();
    }

    @GetMapping("/user/{id}")
    public PersonneModel getUsr(@PathVariable int id) {
        return (PersonneModel) this.persService.findPers(id);
    }


    /*******************************************************
     *                     Add Users
     *******************************************************/
    @PutMapping("/users/add")
    public PersonneModel addUsers(@RequestBody PersonneModel persModel) {
        return this.persService.save(persModel);
    }

    /******************************************************
    *                      Delete Users
    *******************************************************/

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable int id) {
        this.persService.deletepersonne(id);
    }


}