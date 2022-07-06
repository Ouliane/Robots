package powerSupplyUnit;

public class Battery implements PowerSupplyUnit {
    private int chargeLevel = 100;
    private int powerLimit = 20;

    @Override
    public boolean ConsumePower() {
        int currentChargeLevel = chargeLevel - 30;

        if (currentChargeLevel <= powerLimit)
            return false;
        chargeLevel -= 30;
        return true;
    }

    @Override
    public void Charge(Enum fuel) {
        if (fuel == Fuel.ELECTRICITY) {
            chargeLevel = 100;
            System.out.println("Charging completed");
        } else System.out.println("Wrong type of fuel!");
    }
}
