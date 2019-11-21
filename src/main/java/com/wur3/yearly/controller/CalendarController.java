package com.wur3.yearly.controller;

import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
@RestController
public class CalendarController {
    @GetMapping("/")
    @CrossOrigin
    public Response hello() {
        return Response
                .status(Response.Status.OK)
                .entity("h-hewwo")
                .build();
    }

}
