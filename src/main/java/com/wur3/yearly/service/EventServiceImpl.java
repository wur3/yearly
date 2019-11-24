package com.wur3.yearly.service;

import com.wur3.yearly.model.Event;
import com.wur3.yearly.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return (List<Event>)eventRepository.findAll();
    }

    public void createEvent(Event event){
        eventRepository.save(event);
    };

    public void deleteEvent(Long id){
        Event event = eventRepository.findById(id).get();
        eventRepository.delete(event);
    };
}
