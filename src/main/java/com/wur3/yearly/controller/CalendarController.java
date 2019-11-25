package com.wur3.yearly.controller;

import com.wur3.yearly.model.Event;
import com.wur3.yearly.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

@RestController
public class CalendarController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    @CrossOrigin
    /**
     * @return the Response containing all Event objects
     */
    public Response getAllEvents() {
        List<Event> list = eventService.getAllEvents();
        return Response
                .status(Response.Status.OK)
                .entity(list)
                .build();
    }

    @PostMapping(path="/new", consumes="application/json", produces="application/json")
    @CrossOrigin
    /**
     * @return the Response containing the new Event just added
     */
    public Response addEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return Response
                .status(Response.Status.OK)
                .entity(event)
                .build();
    }

    // todo: id not found exception handling
    @DeleteMapping("/{id}")
    @CrossOrigin
    /**
     * @return the Response containing the id of Event just deleted
     */
    public Response deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
        return Response
                .status(Response.Status.OK)
                .entity(id)
                .build();
    }

}
