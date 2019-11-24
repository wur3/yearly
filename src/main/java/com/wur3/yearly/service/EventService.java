package com.wur3.yearly.service;

import com.wur3.yearly.model.Event;

import java.util.List;

public interface EventService {

    abstract List<Event> getAllEvents();

    abstract void createEvent(Event event);

    abstract void deleteEvent(Long id);
}
