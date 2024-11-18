package AirportSimulation;

public class ConveyorBelt {
    private final int gate;
    private boolean isTurned;

    public ConveyorBelt(int gate) {
        this.gate = gate;
        this.isTurned = false;
    }

    public void turn(int time) {
        if (!isTurned) {
            System.out.println("Time: " + time + " - Conveyor belt at gate " + gate + " is turning.");
            isTurned = true;
        }
    }

    public void turnBack(int time) {
        if (isTurned) {
            System.out.println("Time: " + time + " - Conveyor belt at gate " + gate + " is turning back.");
            isTurned = false;
        }
    }

    public int getGate() {
        return gate;
    }

    public boolean isTurned() {
        return isTurned;
    }
}