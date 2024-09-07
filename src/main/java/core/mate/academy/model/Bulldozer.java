package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int chassis;
    private int enginePower;
    private int walkingSpeed;

    public Bulldozer(int chassis, int enginePower, int walkingSpeed) {
        this.chassis = chassis;
        this.enginePower = enginePower;
        this.walkingSpeed = walkingSpeed;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
