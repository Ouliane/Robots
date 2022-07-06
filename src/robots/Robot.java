package robots;

import powerSupplyUnit.PowerSupplyUnit;
import wayOfMoving.WayOfMoving;

public abstract class Robot {

    private PowerSupplyUnit powerSupplyUnit;
    private WayOfMoving wayOfMoving;

    public Robot(PowerSupplyUnit powerSupplyUnit, WayOfMoving wayOfMoving) {
        this.powerSupplyUnit = powerSupplyUnit;
        this.wayOfMoving = wayOfMoving;
    }

    protected boolean ConsumePower(){
        return powerSupplyUnit.ConsumePower();
    }

    public boolean move() {
        if(ConsumePower()) {
            wayOfMoving.move();
            return true;
        }
        System.out.println("Not enough energy. Go to charge");
        return false;
    }

    public void charge(Enum fuel) {
        powerSupplyUnit.Charge(fuel);
    }

    public abstract boolean doWork();
}
