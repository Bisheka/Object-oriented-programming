package LAB_9_4;

public class DeviceInventorySystem {
    public static void main(String[] args) {
        // Create 3 device objects
        Device d1 = new Device(201, "Laptop");
        Device d2 = new Device(202, "Tablet");
        Device d3 = new Device(203, "Smartphone");

        System.out.println("\n=== Device Information ===");
        d1.displayDeviceInfo();
        d2.displayDeviceInfo();
        d3.displayDeviceInfo();

        // Display device count
        Device.displayDeviceCount();
    }
}
