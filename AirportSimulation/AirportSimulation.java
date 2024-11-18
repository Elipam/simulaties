package AirportSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class AirportSimulation extends StoreSimulation {
    private int gates = 10;
    private List<SuitCase> suitcaseList;
    private List<ConveyorBelt> conveyorBelts;
    Random rand = new Random();

    public AirportSimulation() {
        super();
        suitcaseList = new ArrayList<>();
        conveyorBelts = new ArrayList<>();
        for (int i = 1; i <= gates; i++) {
            conveyorBelts.add(new ConveyorBelt(i));
        }
    }

    @Override
    public void initiateSimulation() {
        for (int t = 0; t < 20; t += rand.nextInt(6)) {
            int suitcaseId = suitcaseList.size() + 1;
            int gate = rand.nextInt(gates) + 1; // Assign a random gate when the suitcase is created
            suitcaseList.add(new SuitCase(suitcaseId, gate));
            super.scheduleEvent(new CheckInEvent(t, suitcaseId, this));
        }
    }

    public int getGates() {
        return gates;
    }

    public List<ConveyorBelt> getConveyorBelts() {
        return conveyorBelts;
    }

    public void checkInSuitcase(int id, int gate) {
        System.out.println("Time: " + time + " - Suitcase " + id + " checked in for gate " + gate);
    }

    public void moveSuitcaseToGate(int id, int gate) {
        System.out.println("Time: " + time + " - Suitcase " + id + " moved to gate " + gate);
    }
}