package accessories;

import model.AccessoryDecorator;
import model.Car;

public class Alarm extends AccessoryDecorator {
    Car car;

    public Alarm(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Matrix Alarm 2 Remotes";
    }

    public long cost() {
        return 205000 + car.cost();
    }
}