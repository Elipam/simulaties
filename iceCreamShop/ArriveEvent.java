package iceCreamShop;

import java.util.Random;

class ArriveEvent extends Event {
    private final int size;
    Random rand = new Random();

    public ArriveEvent(int t, int groupSize, StoreSimulation sim) {
        super(t, sim);
        size = groupSize;
    }

    @Override
    public void processEvent() {
        if (super.theSimulation.canSeat(size)) {
            theSimulation.scheduleEvent(new OrderEvent(time + 1 + rand.nextInt(4), size, theSimulation));
        }
    }
}
