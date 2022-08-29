package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airPlan1 = new AirPlan();
        Vehicle airPlan2 = new AirPlan();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle[] vehicles = new Vehicle[] {airPlan1, airPlan2, train1, train2, bus1, bus2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
