package hw1;

public class UniversalSerialBus {
    //------------------------------ATTRIBUTES------------------------------
    private double memoryStorageCapacity;
    private String brand;
    private double readSpeed;
    private String color;
    private String hardwareInterface;

    //------------------------------GETTERS/SETTERS--------------------------

    public double getMemoryStorageCapacity() {
        return memoryStorageCapacity;
    }

    public void setMemoryStorageCapacity(double memoryStorageCapacity) {
        this.memoryStorageCapacity = memoryStorageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(double readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHardwareInterface() {
        return hardwareInterface;
    }

    public void setHardwareInterface(String hardwareInterface) {
        this.hardwareInterface = hardwareInterface;
    }
}
