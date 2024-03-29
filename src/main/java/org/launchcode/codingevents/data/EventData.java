package org.launchcode.codingevents.data;

import jakarta.validation.Valid;
import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to store events
    private static final Map<Integer, Event> events = new HashMap<>();
    // get all events
    public static Collection<Event> getAll() {
        return events.values();
    }


    //get single event
    public static Event getById(int id){
        return events.get(id);
    }


    //add event
    public static void add(@Valid Event event) {
        events.put(event.getId(), event);
    }

    //remove event
    public static void remove(int id) {
        events.remove(id);
    }

}
