package accessories;

import model.AccessoryDecorator;
import model.Car;

public class Rim14Gray extends AccessoryDecorator {
    Car car;

    public Rim14Gray(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", 14 Inch Gray Machined Aluminum Rim";
    }

    public long cost() {
        return 500000 + car.cost();
    }
}