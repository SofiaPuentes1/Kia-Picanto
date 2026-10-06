package accessories;

import model.AccessoryDecorator;
import model.Car;

public class CargoNet extends AccessoryDecorator {
    Car car;

    public CargoNet(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Cargo Net";
    }

    public long cost() {
        return 110000 + car.cost();
    }
}