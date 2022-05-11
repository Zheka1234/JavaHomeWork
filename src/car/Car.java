package car;



public class Car implements carMoving{


    private String brand;

    private String model;

    private int accelerationToHundreds;

    private double engineVolume ;

    private int numberOfDoors ;




    public Car() {
        this.brand = ": ";
        this.model = ": ";
        this.numberOfDoors = 4;
        this.engineVolume = 4.0;
        this.accelerationToHundreds = 4;
    }

    public Car(
            String brand, String model,int numberOfDoors ,double engineVolume,int numberOfSeats ) {
        this.numberOfDoors  = numberOfDoors ;
        this.engineVolume = engineVolume;

        this.accelerationToHundreds  = numberOfSeats ;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAccelerationToHundreds() {
        return accelerationToHundreds;
    }

    public void setAccelerationToHundreds(int accelerationToHundreds) {
        this.accelerationToHundreds = accelerationToHundreds;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", accelerationToHundreds=" + accelerationToHundreds +
                ", engineVolume=" + engineVolume +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (accelerationToHundreds != car.accelerationToHundreds) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (numberOfDoors != car.numberOfDoors) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + accelerationToHundreds;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numberOfDoors;
        return result;
    }

    @Override
    public void run() {
        System.out.printf("Run: " + getBrand() + " " + getModel() + " " + "mileage: %.2f\n", (1 + Math.random() * 500));
    }

    @Override
    public int move() {
        return (int) (1 + Math.random() * 400);
    }
}

