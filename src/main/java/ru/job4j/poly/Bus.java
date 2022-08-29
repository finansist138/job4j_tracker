package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {

    }

    @Override
    public void numberOfPass(int numberOfPass) {

    }

    @Override
    public double refuel(int fuel) {
        double priceOfDiesel = 56.65;
        return fuel * priceOfDiesel;
    }
}
