package LAB_9_4;

class Device {
    private int deviceId;
    private String deviceType;

    // Static variable to track device count
    static int deviceCount;

    // Static block to initialize deviceCount
    static {
        deviceCount = 100;
        System.out.println("Static block executed: deviceCount initialized to " + deviceCount);
    }

    // Constructor
    public Device(int deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        deviceCount++; // Increment count when a device is created
    }

    // Instance method to display device info
    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Type: " + deviceType);
        System.out.println("-----------------------------");
    }

    // Static method to display current device count
    public static void displayDeviceCount() {
        System.out.println("Total Devices Registered: " + deviceCount);
    }
}
