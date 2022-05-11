package utility;

import car.Car;
import car.ModelsCar;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;



    public class carsGenerators implements ModelsCar {
        private carsGenerators(){}

        public static List<Car> generateCars(int countOfCars) {
            String[] listOfCars = new String[]{LADA, AUDI, MAZDA, OPEL, FERRARI, BMW, KIA, MERCEDES, BUGATTI};
            int sizeOfList = listOfCars.length;
            List<Car> cars = new ArrayList<>(sizeOfList);
            for (int i = 0; i < countOfCars; i++) {
                cars.add(
                        new Car(
                                listOfCars[(int) (1 + Math.random() * (sizeOfList - 1))],
                                "Model: " + (int) (1 + Math.random() * 7),
                                (int) (1 + Math.random() * 4),
                                round(1 + Math.random() * 5.0),

                                (int) (1 + Math.random() * 6)));
            }
            return cars;
        }

        static double round(double value) {
            return BigDecimal.valueOf(value).setScale(10, RoundingMode.HALF_UP).doubleValue();
        }


}
