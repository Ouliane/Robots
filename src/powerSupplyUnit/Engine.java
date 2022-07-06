package powerSupplyUnit;

public class Engine implements PowerSupplyUnit {
    private int chargeLevel = 100;
    private int powerLimit = 20;
    private Enum fuelType;


    public Engine(Enum fuelType) {
        if (fuelType != Fuel.DIESEL_FUEL && fuelType != Fuel.PETROL)
            throw new IllegalArgumentException("Internal combustion engine can only be diesel or petrol!");
        this.fuelType = fuelType;
    }

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
        if (fuel == fuelType) {
            chargeLevel = 100;
            System.out.println("Charging completed");
        } else System.out.println("Wrong type of fuel!");
    }
}
