package iceCreamShop;

import java.util.Random;

class OrderEvent extends Event {
    private final int size;
    Random rand = new Random();

    public OrderEvent(int t, int groupSize, StoreSimulation sim) {
        super(t, sim);
        size = groupSize;
    }

    @Override
    public void processEvent() {
        for (int i = 0; i < size; i++) {
            theSimulation.order(1 + rand.nextInt(4));
        }

        theSimulation.scheduleEvent(new LeaveEvent(time + 1 + rand.nextInt(10), size, theSimulation));
    }
}
