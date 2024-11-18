package AirportSimulation;

class SuitcaseArrivedEvent extends Event {
    private final int suitcaseId;
    private final int gate;

    public SuitcaseArrivedEvent(int t, int id, int gate, AirportSimulation sim) {
        super(t, sim);
        suitcaseId = id;
        this.gate = gate;
    }

    @Override
    public void processEvent() {
        System.out.println("Time: " + time + " - Suitcase " + suitcaseId + " arrived at gate " + gate);
        for (ConveyorBelt belt : theSimulation.getConveyorBelts()) {
            if (belt.getGate() == gate) {
                belt.turnBack(time);
                break;
            }
        }
    }
}