package LAB_9_1;

class Bus extends Transport {
    public Bus(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    public double calculateFare() {
        return 10 * distanceTravelled;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Transport Type: Bus");
        System.out.println("Fare: ₹" + calculateFare());
    }
}
