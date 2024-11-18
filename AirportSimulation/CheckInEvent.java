package AirportSimulation;

import java.util.Random;

class CheckInEvent extends Event {
    private final int suitcaseId;
    Random rand = new Random();

    public CheckInEvent(int t, int id, AirportSimulation sim) {
        super(t, sim);
        suitcaseId = id;
    }

    @Override
    public void processEvent() {
        int gate = rand.nextInt(theSimulation.getGates()) + 1;
        theSimulation.checkInSuitcase(suitcaseId, gate);
        theSimulation.scheduleEvent(new MoveToGateEvent(time + 1 + rand.nextInt(4), suitcaseId, gate, theSimulation));
    }
}