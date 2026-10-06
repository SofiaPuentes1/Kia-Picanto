package accessories;

import model.AccessoryDecorator;
import model.Car;

public class ParkingSensor extends AccessoryDecorator {
    Car car;

    public ParkingSensor(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Parking Sensor";
    }

    public long cost() {
        return 150000 + car.cost();
    }
}