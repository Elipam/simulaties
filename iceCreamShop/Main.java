package iceCreamShop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ice Cream Store simulation ");
        IceCreamStore theSimulation = new IceCreamStore();
        theSimulation.initiateSimulation();
        theSimulation.run();

        System.out.println("Total profits " + theSimulation.getProfit());
        System.out.println("End of ice cream store simulation");
    }
}
