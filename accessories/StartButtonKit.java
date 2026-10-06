package accessories;

import model.AccessoryDecorator;
import model.Car;

public class StartButtonKit extends AccessoryDecorator {
    Car car;

    public StartButtonKit(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Start Button Kit with Alarm and 2 Remotes";
    }

    public long cost() {
        return 1500000 + car.cost();
    }
}