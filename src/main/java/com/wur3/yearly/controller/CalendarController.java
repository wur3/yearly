package com.wur3.yearly.controller;

import com.wur3.yearly.model.Event;
import com.wur3.yearly.repository.EventRepository;
import com.wur3.yearly.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CalendarController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    @CrossOrigin
    // returns Response containing all Events
    public Response getAllEvents() {
        List<Event> list = eventService.getAllEvents();
        return Response
                .status(Response.Status.OK)
                .entity(list)
                .build();
    }

    @PostMapping(path="/new", consumes="application/json", produces="application/json")
    @CrossOrigin
    // adds new Event
    public Response addEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return Response
                .status(Response.Status.OK)
                .entity("added")
                .build();
    }

    // todo: id not found exception handling
    @DeleteMapping("/{id}")
    @CrossOrigin
    // deletes Event by Id
    public Response deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
        return Response
                .status(Response.Status.OK)
                .entity("Deleted")
                .build();
    }

}
