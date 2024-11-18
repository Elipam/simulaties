package iceCreamShop;

class LeaveEvent extends Event {
    private final int size;

    public LeaveEvent(int t, int groupSize, StoreSimulation sim) {
        super(t, sim);
        size = groupSize;
    }

    @Override
    public void processEvent() {
        theSimulation.leave(size);
    }
}
