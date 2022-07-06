import powerSupplyUnit.Engine;
import powerSupplyUnit.Fuel;
import powerSupplyUnit.NuclearReactor;
import robots.CookBot;
import robots.WeldingBot;
import wayOfMoving.Legs;
import wayOfMoving.Wings;
import weapons.MachineGun;
import weapons.Sword;
import powerSupplyUnit.Battery;
import robots.Robot;
import robots.WarBot;
import wayOfMoving.Caterpillars;

public class Main {
    public static void main(String[] args) {
        Robot warRobot1 = new WarBot(new Battery(), new Caterpillars(), new Sword());
        Robot warRobot2 = new WarBot(new Engine(Fuel.PETROL), new Caterpillars(), new MachineGun());
        Robot warRobot3 = new WarBot(new NuclearReactor(), new Legs(), new MachineGun());
        Robot cookRobot1 = new CookBot(new Battery(), new Wings());
        Robot cookRobot2 = new CookBot(new Engine(Fuel.DIESEL_FUEL), new Legs());
        Robot cookRobot3 = new CookBot(new NuclearReactor(), new Caterpillars());
        Robot weldingRobot1 = new WeldingBot(new NuclearReactor(), new Legs());
        Robot weldingRobot2 = new WeldingBot(new Engine(Fuel.DIESEL_FUEL), new Wings());
        Robot weldingRobot3 = new WeldingBot(new Engine(Fuel.PETROL), new Caterpillars());

        System.out.println("War robot on electric battery with sword");
        if (!warRobot1.move())
            warRobot1.charge(Fuel.ELECTRICITY);
        if (!warRobot1.doWork())
            warRobot1.charge(Fuel.ELECTRICITY);
        if (!warRobot1.move())
            warRobot1.charge(Fuel.ELECTRICITY);

        System.out.println("\nWar robot on petrol engine with machinegun");
        if (!warRobot2.move())
            warRobot2.charge(Fuel.PETROL);
        if (!warRobot2.doWork())
            warRobot2.charge(Fuel.PETROL);
        if (!warRobot2.move())
            warRobot2.charge(Fuel.PETROL);

        System.out.println("\nWar robot on nuclear energy with machinegun");
        if (!warRobot3.move())
            warRobot3.charge(Fuel.URANIUM_ROD);
        if (!warRobot3.doWork())
            warRobot3.charge(Fuel.URANIUM_ROD);
        if (!warRobot3.move())
            warRobot3.charge(Fuel.URANIUM_ROD);

        System.out.println("\nCook robot on electric battery");
        if (!cookRobot1.move())
            cookRobot1.charge(Fuel.ELECTRICITY);
        if (!cookRobot1.doWork())
            cookRobot1.charge(Fuel.ELECTRICITY);
        if (!cookRobot1.move())
            cookRobot1.charge(Fuel.ELECTRICITY);

        System.out.println("\nCook robot on diesel engine");
        if (!cookRobot2.move())
            cookRobot2.charge(Fuel.DIESEL_FUEL);
        if (!cookRobot2.doWork())
            cookRobot2.charge(Fuel.DIESEL_FUEL);
        if (!cookRobot2.move())
            cookRobot2.charge(Fuel.DIESEL_FUEL);

        System.out.println("\nCook robot on nuclear energy");
        if (!cookRobot3.move())
            cookRobot3.charge(Fuel.URANIUM_ROD);
        if (!cookRobot3.doWork())
            cookRobot3.charge(Fuel.URANIUM_ROD);
        if (!cookRobot3.move())
            cookRobot3.charge(Fuel.URANIUM_ROD);

        System.out.println("\nWelding robot on nuclear energy");
        if (!weldingRobot1.move())
            weldingRobot1.charge(Fuel.URANIUM_ROD);
        if (!weldingRobot1.doWork())
            weldingRobot1.charge(Fuel.URANIUM_ROD);
        if (!weldingRobot1.move())
            weldingRobot1.charge(Fuel.URANIUM_ROD);

        System.out.println("\nWelding robot on diesel engine");
        if (!weldingRobot2.move())
            weldingRobot2.charge(Fuel.DIESEL_FUEL);
        if (!weldingRobot2.doWork())
            weldingRobot2.charge(Fuel.DIESEL_FUEL);
        if (!weldingRobot2.move())
            weldingRobot2.charge(Fuel.DIESEL_FUEL);

        System.out.println("\nWelding robot on petrol engine");
        if (!weldingRobot3.move())
            weldingRobot3.charge(Fuel.PETROL);
        if (!weldingRobot3.doWork())
            weldingRobot3.charge(Fuel.PETROL);
        if (!weldingRobot3.move())
            weldingRobot3.charge(Fuel.PETROL);

        System.out.println("\nThe robot is filled with the wrong fuel");
        if (!weldingRobot3.move())
            weldingRobot3.charge(Fuel.ELECTRICITY);
        if (!weldingRobot3.doWork())
            weldingRobot3.charge(Fuel.ELECTRICITY);
        if (!weldingRobot3.move())
            weldingRobot3.charge(Fuel.ELECTRICITY);

    }
}
