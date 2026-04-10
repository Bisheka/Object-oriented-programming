package LAB_9_1;

abstract public class  Transport {
    protected String vehicleNumber;
    protected double distanceTravelled;
    public Transport(String vehicleNumber, double distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    // Abstract method
    public abstract double calculateFare();

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance Travelled: " + distanceTravelled + " km");
    }
}
