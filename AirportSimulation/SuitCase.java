package AirportSimulation;

public class SuitCase {
    private final int id;
    private int gate;

    public SuitCase(int id, int gate) {
        this.id = id;
        this.gate = gate;
    }

    public int getId() {
        return id;
    }

    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }
}
