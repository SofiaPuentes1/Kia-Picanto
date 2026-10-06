package accessories;

import model.AccessoryDecorator;
import model.Car;

public class TowHitch extends AccessoryDecorator {
    Car car;

    public TowHitch(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Tow Hitch";
    }

    public long cost() {
        return 810000 + car.cost();
    }
}