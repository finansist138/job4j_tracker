package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("График движения транспорта: понедельник - пятница с 9.00 до 21.00");
    }

    @Override
    public void numberOfPass(int numberOfPass) {
        System.out.println("Максимальная вместимость пассажиров"
                + " в данный автобус: " + numberOfPass);
    }

    @Override
    public double refuel(int fuel) {
        double priceOfDiesel = 56.65;
        return fuel * priceOfDiesel;
    }
}
