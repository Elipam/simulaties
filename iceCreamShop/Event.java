package iceCreamShop;

abstract class Event {
    public final int time;
    public final StoreSimulation theSimulation;

    public abstract void processEvent();

    public Event(int t, StoreSimulation sim) {
        time = t;
        theSimulation = sim;
    }

}
