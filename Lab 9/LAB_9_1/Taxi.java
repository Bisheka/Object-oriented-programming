package LAB_9_1;

class Taxi extends Transport {
    public Taxi(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    public double calculateFare() {
        return 20 * distanceTravelled + 50; // base fee of ₹50
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Transport Type: Taxi");
        System.out.println("Fare: ₹" + calculateFare());
    }
}
