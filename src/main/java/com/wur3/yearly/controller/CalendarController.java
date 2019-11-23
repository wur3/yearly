package com.wur3.yearly.controller;

import com.wur3.yearly.model.EventModel;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.Arrays;

@RestController
public class CalendarController {
    @GetMapping("/")
    @CrossOrigin
    public Response allEvents() {
        return Response
                .status(Response.Status.OK)
                .entity(Arrays.asList(new EventModel(9,8,"birthday")))
                .build();
    }

}
