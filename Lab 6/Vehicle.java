public class Vehicle {
    protected String vehicleName;

    public Vehicle(){
        this.vehicleName="Vehicle";
    }
    public Vehicle(String vehicleName){
        this.vehicleName=vehicleName;
    }
    public double calculateSpeed(){
        return 0.0;
    }
    public double calculateSpeed(double factor){
        return calculateSpeed()*factor;
    }
    public void displayVehicleDetails(){
        System.out.println("Vehicle Name:"+vehicleName);
    }
}
class Car extends Vehicle{
    private int engineCapacity;
    private double topSpeed;

    public Car(){
        super("Car");
        this.engineCapacity=1000;
        this.topSpeed=120.0;
    }
    public Car(String VehicleName,int engineCapacity,double topSpeed){
        super(VehicleName);
        this.engineCapacity=engineCapacity;
        this.topSpeed=topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }
    @Override
    public void displayVehicleDetails(){
        System.out.println("Car details");
        System.out.println("Vehicle Name:"+vehicleName);
        System.out.println("Engine Capacity:"+engineCapacity+"CC");
        System.out.println("Top speed"+calculateSpeed()+"km/h");
    }
}
class Bicycle extends Vehicle{
    private int gearCount;
    private double maxPedalSpeed;

    public Bicycle(){
        super("Bicycle");
        this.gearCount=1;
        this.maxPedalSpeed=20;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Bicycle details");
        System.out.println("Vehicle Name:"+vehicleName);
        System.out.println("Gear Count:"+gearCount);
        System.out.println("Max Pedal Speed:"+maxPedalSpeed+"km/h");
    }
}
