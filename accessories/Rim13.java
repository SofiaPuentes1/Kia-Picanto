package accessories;

import model.AccessoryDecorator;
import model.Car;

public class Rim13 extends AccessoryDecorator {
    Car car;

    public Rim13(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", 13 Inch Aluminum Rim";
    }

    public long cost() {
        return 350000 + car.cost();
    }
}