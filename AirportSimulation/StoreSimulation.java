package AirportSimulation;

import java.util.PriorityQueue;
import java.util.Comparator;

abstract class StoreSimulation {
    public int time;
    protected PriorityQueue<Event> eventQueue;

    public StoreSimulation() {
        time = 0;
        eventQueue = new PriorityQueue<>(new EventComparator());
    }

    public void run() {
        while (!eventQueue.isEmpty()) {
            Event nextEvent = eventQueue.poll();
            time = nextEvent.time;
            nextEvent.processEvent();
            nextEvent = null;
        }
    }

    public void scheduleEvent(Event newEvent) {
        eventQueue.add(newEvent);
    }

    public abstract void initiateSimulation();
}