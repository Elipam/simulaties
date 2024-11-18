package AirportSimulation;

class MoveToGateEvent extends Event {
    private final int suitcaseId;
    private final int gate;

    public MoveToGateEvent(int t, int id, int gate, AirportSimulation sim) {
        super(t, sim);
        suitcaseId = id;
        this.gate = gate;
    }

    @Override
    public void processEvent() {
        theSimulation.moveSuitcaseToGate(suitcaseId, gate);
        theSimulation.scheduleEvent(new ConveyorBeltTurnEvent(time + 1, suitcaseId, gate, theSimulation));
    }
}