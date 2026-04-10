class VehicleSpeedSystem{
    public static void main(String[] args) {
        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        System.out.println("=====Car Test======");
        System.out.println("Normal Speed"+car.calculateSpeed()+"Km/h");
        System.out.println("Scaled speed(factor 1.5):"+car.calculateSpeed(1.5)+"Km/h");
        car.displayVehicleDetails();
        System.out.println();
        System.out.println("=====Bicycle Test=====");
        System.out.println("Normal Speed"+bicycle.calculateSpeed()+"Km/h");
        System.out.println("Scaled speed(factor 0.8)"+car.calculateSpeed(0.8)+"Km/h");
        bicycle.displayVehicleDetails();


    }
}

