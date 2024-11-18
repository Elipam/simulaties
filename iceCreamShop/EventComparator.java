package iceCreamShop;

import java.util.Comparator;

class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event left, Event right) {
        return Integer.compare(left.time, right.time);
    }
}
