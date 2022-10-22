package hw1;

public class Scissors {
    //------------------------------ATTRIBUTES------------------------------
    private String brand;
    private boolean isSharp;
    private boolean isMetallic;
    private String color;
    private String material;

    //------------------------------GETTERS/SETTERS--------------------------

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void setSharp(boolean sharp) {
        isSharp = sharp;
    }

    public boolean isMetallic() {
        return isMetallic;
    }

    public void setMetallic(boolean metallic) {
        isMetallic = metallic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
