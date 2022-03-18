public abstract class Vehicle{
    String model, color;
    int year, numWheels;
    double price, weight, mileage;


    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract Vehicle Input();
    public abstract String turn();
    public abstract String toString();

    public static Vehicle createVehicle(VehicleType vehicleType) {
        Vehicle result;
        if (vehicleType == VehicleType.Bicycle) {
            result = new Bicycle();
        } else if (vehicleType == VehicleType.Bike) {
            result = new Bike();
        } else if (vehicleType == VehicleType.Car) {
            result = new Car();
        } else {
            result = new Truck();
        }
        return result.Input();
    }
}