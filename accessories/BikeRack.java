package accessories;

import model.AccessoryDecorator;
import model.Car;

public class BikeRack extends AccessoryDecorator {
    Car car;

    public BikeRack(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Bike Rack for 2 Bikes";
    }

    public long cost() {
        return 910000 + car.cost();
    }
}