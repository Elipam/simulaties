package iceCreamShop;

import java.util.Random;

class IceCreamStore extends StoreSimulation {
    private int freeChairs;
    private double profit;
    Random rand = new Random();

    public IceCreamStore() {
        super();
        freeChairs = 35;
        profit = 0.0;
    }

    @Override
    public void initiateSimulation() {
        for (int t = 0; t < 20; t += rand.nextInt(6)) {
            System.out.println("pumping queue with event " + t);
            super.scheduleEvent(new ArriveEvent(t, 1 + rand.nextInt(4), this));
        }
    }

    @Override
    public boolean canSeat(int numberOfPeople) {
        System.out.println("Time: " + time);
        System.out.println("group of " + numberOfPeople + " customers arrives");
        if (numberOfPeople < freeChairs) {
            System.out.println("is seated");
            freeChairs -= numberOfPeople;
            return true;
        } else {
            System.out.println("no room, they leave");
            return false;
        }
    }

    @Override
    public void order(int numberOfScoops) {
        System.out.println("Time: " + time + " serviced order for " + numberOfScoops);
        profit += 0.35 * numberOfScoops;
    }

    @Override
    public void leave(int numberOfPeople) {
        System.out.println("Time: " + time + " group of size " + numberOfPeople + " leaves");
        freeChairs += numberOfPeople;
    }

    public double getProfit() {
        return profit;
    }
}
