package powerSupplyUnit;

public class NuclearReactor implements PowerSupplyUnit {

    private int chargeLevel = 50;
    private int powerLimit = 0;

    @Override
    public boolean ConsumePower() {
        int currentChargeLevel = chargeLevel - 20;

        if (currentChargeLevel <= powerLimit)
            return false;
        chargeLevel -= 20;
        return true;
    }

    @Override
    public void Charge(Enum fuel) {
        if (fuel == Fuel.URANIUM_ROD) {
            chargeLevel = 50;
            System.out.println("Charging completed");
        } else System.out.println("Wrong type of fuel!");
    }
}
