class Vehicle {
    String brand, model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, String fuelType) {
        super(brand, model);
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    int battery;

    ElectricCar(String brand, String model, int battery) {
        super(brand, model, "Electric");
        this.battery = battery;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + battery + " kWh");
    }
}

public class Lab_3 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla", "Model 3", 75);
        e.displayInfo();
    }
}
