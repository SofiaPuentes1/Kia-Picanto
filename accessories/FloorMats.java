package accessories;

import model.AccessoryDecorator;
import model.Car;

public class FloorMats extends AccessoryDecorator {
    Car car;

    public FloorMats(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Three Piece Floor Mats";
    }

    public long cost() {
        return 92000 + car.cost();
    }
}