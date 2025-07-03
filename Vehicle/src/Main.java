public class Main {
    public static void main(String[] args) {

        // Create a Car object using the parameterized constructor
        Car tesla = new Car("Tesla", "Model S", "Red");

        // Use inherited methods
        tesla.accelerate();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.adjustSeat(2);

        SportsCar ferrari =  new SportsCar(
                "Ferrari",
                "F-8 Tributo",
                "Yellow");
        ferrari.activateTurboBoost();
        System.out.println(ferrari.model + " is running at " + ferrari.getSpeed() + " miles per hour.");
    }
}
