package car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    public int compare(Car x, Car y){
        return Integer.compare(x.getAccelerationToHundreds(), y.getAccelerationToHundreds());
    }
}
