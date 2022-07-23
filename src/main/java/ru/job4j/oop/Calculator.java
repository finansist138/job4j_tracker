package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiplay(int a) {
        return x * a;
    }

    public static int minus(int minus) {
        return minus - x;
    }

    public int divide(int divide) {
        return divide / x;
    }

    public int sumAllOperation(int result) {
        return sum(result) +  multiplay(result) + minus(result) + divide(result);
    }

    public static void main(String[] args) {
        int resultSum = sum(5);
        Calculator calculator = new Calculator();
        int resultMultiplay = calculator.multiplay(2);
        int resultMinus = minus(7);
        int resultDivide = calculator.divide(10);
        int resultSumAllOperation = calculator.sumAllOperation(5);
        System.out.println(resultSum);
        System.out.println(resultMultiplay);
        System.out.println(resultMinus);
        System.out.println(resultDivide);
        System.out.println(resultSumAllOperation);
    }
}
