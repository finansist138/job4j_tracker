package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petrov Petr Petrovich");
        student.setGroup(3);
        student.setReceipt(new Date());
        System.out.println(student.getFullName() + ", " + "studying in group № "
                + student.getGroup() + ", " + "receipt date: " + student.getReceipt());
    }
}
