package AirportSimulation;

abstract class Event {
    public final int time;
    public final AirportSimulation theSimulation;

    public abstract void processEvent();

    public Event(int t, AirportSimulation sim) {
        time = t;
        theSimulation = sim;
    }
}