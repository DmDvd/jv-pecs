package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int engineVolume;
    private int carryingCapacity;
    private String bodyType;

    public Truck(int engineVolume, int carryingCapacity, String bodyType) {
        this.engineVolume = engineVolume;
        this.carryingCapacity = carryingCapacity;
        this.bodyType = bodyType;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
