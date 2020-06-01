package com.meetup.Controller;

import com.meetup.Model.Events;
import com.meetup.Services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EventsController {
    EventsService eventsService;

    @Autowired
    public EventsController(final EventsService eventsService) {
        this.eventsService = eventsService;
    }
    

    /*******************************************************
     *                      List of Events
     *******************************************************/
    @GetMapping("/events")
    public List<Events> showEvents() {
        return this.eventsService.findAll();
    }

    @GetMapping("/events/{id}")
    public Events getEvt(@PathVariable int id) {
        return (Events) this.eventsService.findbyId(id);
    }


    /*******************************************************
     *                     Add Events
     *******************************************************/
    @PutMapping("/addEvents")
    public Events addUsers(@RequestBody Events events) {
        return this.eventsService.save(events);
    }

    /******************************************************
     *                      Delete Events
     *******************************************************/

    @DeleteMapping("/events/{id}")
    public void delete(@PathVariable int id) {
        this.eventsService.delete(id);
    }


}
