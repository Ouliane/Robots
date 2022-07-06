package robots;

import powerSupplyUnit.PowerSupplyUnit;
import wayOfMoving.WayOfMoving;

public class WeldingBot extends Robot {

    public WeldingBot(PowerSupplyUnit psu, WayOfMoving chassis) {
        super(psu, chassis);
    }

    @Override
    public boolean doWork() {
        if(ConsumePower()) {
            System.out.println("Weld...");
            return true;
        }
        System.out.println("Not enough energy");
        return false;
    }
}
