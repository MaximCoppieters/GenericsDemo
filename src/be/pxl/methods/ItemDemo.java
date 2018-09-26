package be.pxl.methods;

import be.pxl.methods.items.*;

public class ItemDemo {
    public static void main(String[] args) {
        Jar<FidgetSpinner> fidgetSpinnerJar = new Jar<>();
        Jar<Battery> batteryJar = new Jar<>();

        FidgetSpinner spinner = new FidgetSpinner();
        Car ferrari = new Ferrari();
        Battery duracell = new Battery();

        fidgetSpinnerJar.addObject(spinner);
        //fidgetSpinnerJar.addObject(duracell);
        // Werkt niet omdat de fidgetSpinnerJar enkel FigetSpinners bijhoudt

        batteryJar.addObject(duracell);

        //Jar<Car> carJar = new Jar<Car>();
        // Werkt niet omdat een auto de SmallItem klasse niet overerft

        //shipInBox(ferrari);
        //De methode shipInBox staat enkel types toe die overerven van smallitem
        shipInBox(spinner);

        breakJar(batteryJar);
        breakJar(fidgetSpinnerJar); // Eender welk type jar kan gebroken worden

        Market<Car> carMarket = new Market<>();
        Market<FidgetSpinner> fidgetSpinnerMarket = new Market<>();

        carMarket.addItemWithPrice(ferrari, 200000.0);
        fidgetSpinnerMarket.addItemWithPrice(spinner, 0.01);

        //organiseShow(fidgetSpinnerMarket); //Enkel automarkten toegestaan
        organiseShow(carMarket);
    }

    public static <T extends SmallItem> void shipInBox(T itemToShip) {
        System.out.printf("Item %s is being shipped in a box.%n", itemToShip.getClass().getSimpleName());
    }

    public static void breakJar(Jar<?> unfortunateJar) {
        System.out.printf("You broke the jar!%n");
    }

    public static void organiseShow(Market<? super Car> itemMarket) {
        System.out.println("Organising big show!");
    }
}
