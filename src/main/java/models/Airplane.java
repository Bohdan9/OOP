package models;

public class Airplane {
    private String model;
    private int flyRange;
    private int fuelComposition;
    private int passengerCapacity;
    private int loadCapacity;
    private int price;

    public Airplane() {
    }

    Airplane(String model, int flyRange, int fuelComposition, int passengerCapacity, int loadCapacity, int price) {
        this.model = model;
        this.flyRange = flyRange;
        this.fuelComposition = fuelComposition;
        this.passengerCapacity = passengerCapacity;
        this.loadCapacity = loadCapacity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    int getFlyRange() {
        return flyRange;
    }

    public void setFlyRange(int flyRange) {
        this.flyRange = flyRange;
    }

    int getFuelComposition() {
        return fuelComposition;
    }

    public void setFuelComposition(int fuelComposition) {
        this.fuelComposition = fuelComposition;
    }

    int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int totalCapacity) {
        this.passengerCapacity = totalCapacity;
    }

    int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", flyRange=" + flyRange +
                ", fuelComposition=" + fuelComposition +
                ", passengerCapacity=" + passengerCapacity +
                ", loadCapacity=" + loadCapacity +
                ", price=" + price +
                '}';
    }
}
