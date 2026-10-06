package app;

import accessories.Alarm;
import accessories.BikeRack;
import accessories.CargoNet;
import accessories.FloorMats;
import accessories.ParkingSensor;
import accessories.Rim13;
import accessories.Rim14Black;
import accessories.Rim14Gray;
import accessories.SecurityBolts;
import accessories.StartButtonKit;
import accessories.TowHitch;
import cars.GTLineAT;
import cars.VibrantMT;
import cars.ZenithAT;
import cars.ZenithMT;
import model.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new VibrantMT();
        System.out.println(car1.getDescription() + " $" + car1.cost());

        Car car2 = new ZenithMT();
        car2 = new StartButtonKit(car2);
        car2 = new StartButtonKit(car2);
        car2 = new StartButtonKit(car2);
        car2 = new StartButtonKit(car2);
        System.out.println(car2.getDescription() + " $" + car2.cost());

        Car car3 = new ZenithAT();
        car3 = new FloorMats(car3);
        car3 = new ParkingSensor(car3);
        car3 = new Rim13(car3);
        car3 = new Alarm(car3);
        car3 = new CargoNet(car3);
        System.out.println(car3.getDescription() + " $" + car3.cost());

        Car car4 = new GTLineAT();
        car4 = new Rim14Black(car4);
        car4 = new Rim14Black(car4);
        car4 = new Rim14Gray(car4);
        car4 = new Rim14Gray(car4);
        car4 = new SecurityBolts(car4);
        car4 = new TowHitch(car4);
        car4 = new BikeRack(car4);
        car4 = new BikeRack(car4);
        System.out.println(car4.getDescription() + " $" + car4.cost());
    }
}