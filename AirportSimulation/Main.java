package AirportSimulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Airport suitcase simulation");
        AirportSimulation theSimulation = new AirportSimulation();
        theSimulation.initiateSimulation();
        theSimulation.run();
        System.out.println("End of airport suitcase simulation");
    }
}