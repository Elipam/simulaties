package AirportSimulation;

class ConveyorBeltTurnEvent extends Event {
    private final int suitcaseId;
    private final int gate;

    public ConveyorBeltTurnEvent(int t, int id, int gate, AirportSimulation sim) {
        super(t, sim);
        suitcaseId = id;
        this.gate = gate;
    }

    @Override
    public void processEvent() {
        for (ConveyorBelt belt : theSimulation.getConveyorBelts()) {
            if (belt.getGate() == gate) {
                belt.turn(time);
                break;
            }
        }
        theSimulation.scheduleEvent(new SuitcaseArrivedEvent(time + 2, suitcaseId, gate, theSimulation)); // Constant 2
                                                                                                          // seconds
    }
}