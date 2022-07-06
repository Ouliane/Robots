package robots;

import weapons.Weapon;
import powerSupplyUnit.PowerSupplyUnit;
import wayOfMoving.WayOfMoving;

public class WarBot extends Robot {

    private Weapon weapon;

    public WarBot(PowerSupplyUnit powerSupplyUnit, WayOfMoving wayOfMoving, Weapon weapon) {
        super(powerSupplyUnit, wayOfMoving);
        this.weapon = weapon;
    }

    @Override
    public boolean doWork() {
        if(ConsumePower()) {
            weapon.attack();
            return true;
        }
        System.out.println("Not enough energy");
        return false;
    }
}
