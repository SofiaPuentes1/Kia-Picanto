package accessories;

import model.AccessoryDecorator;
import model.Car;

public class SecurityBolts extends AccessoryDecorator {
    Car car;

    public SecurityBolts(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Starlock Security Bolts";
    }

    public long cost() {
        return 156100 + car.cost();
    }
}