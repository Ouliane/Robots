package robots;

import powerSupplyUnit.PowerSupplyUnit;
import wayOfMoving.WayOfMoving;

public class CookBot extends Robot {

    public CookBot(PowerSupplyUnit psu, WayOfMoving chassis) {
        super(psu, chassis);
    }

    @Override
    public boolean doWork() {
        if (ConsumePower()) {
            System.out.println("Cooking...");
            return true;
        }
        System.out.println("Not enough energy");
        return false;
    }
}
