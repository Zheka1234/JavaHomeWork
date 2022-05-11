package car;

import utility.carsGenerators;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        int count = 10;
        List<Car> cars = carsGenerators.generateCars(count);
        for (Car car : cars) {
            System.out.println(car);
        }

        CarComparator carComparator = new CarComparator();
        cars.sort(carComparator);

        for (Car car : cars) {
            System.out.println(car);
        }

        for (Car car : cars) {
            ((carMoving ) car).run();
            System.out.println("Max speed: "+ car.getBrand() + " " + car.getModel() + " : " + ((carMoving ) car).move() + "km/h");
        }

    }

}

