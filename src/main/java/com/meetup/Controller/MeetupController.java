package com.meetup.Controller;

import com.meetup.Dao.UserRepository;
import com.meetup.Model.User;
import com.meetup.Services.UserDetailsImpl;
import com.meetup.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MeetupController {
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    public MeetupController(final UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String hompePage() {
        return "Welcome to meetUpz";
    }

    /*******************************************************
     *                      List of Users
     *******************************************************/
    @GetMapping("/user")
    public List<User> showUsers() {
        return this.userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUsr(@PathVariable int id) {
        return this.userService.findPers(id);
    }


    /*******************************************************
     *                     Add Users
     *******************************************************/
    @PutMapping("/users/add")
    public User addUsers(@RequestBody User persModel) {
        return this.userService.save(persModel);
    }

    /******************************************************
    *                      Delete Users
    *******************************************************/

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable int id) {
        this.userService.deletepersonne(id);
    }


}
