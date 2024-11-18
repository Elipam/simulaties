package iceCreamShop;

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
            System.out.println("Going to process next event time = " + time);
            nextEvent.processEvent();
            nextEvent = null;
        }
    }

    public void scheduleEvent(Event newEvent) {
        eventQueue.add(newEvent);
    }

    public abstract boolean canSeat(int numberOfPeople);

    public abstract void order(int numberOfScoops);

    public abstract void leave(int numberOfPeople);

    public abstract void initiateSimulation();
}

class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event left, Event right) {
        return Integer.compare(left.time, right.time);
    }
}
