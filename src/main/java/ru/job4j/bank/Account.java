package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета.
 * @author ARTEM ARTEMOV
 * @version 1.0
 */
public class Account {
    /**
     * Эта модель содержит поля: реквизиты банковского счета и баланс.
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор принимает на вход два параметра:
     * @param requisite содержит банковские реквизиты и
     * @param balance сожержит данные о балансе на счете.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить информацию о банковских реквизитах
     * @return возвращает банковские реквизиты или null если строка пуста.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает на вход банковские реквизиты
     * @param requisite переопределяет поле реквизиты банковского счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить информацию о балансе на счете
     * @return возвращает данные о балансе.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает на вход данные о балансе на счете
     * @param balance переопределяет поле баланс на банковском счете.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод позволяет сравнить между собой счета по реквизитам банковского счета
     * @param o - это входящий параметр для сравнения
     * @return возвращает true если реквизиты банковских счетов равны или false если нет.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод позволяет получить hashCode для реквизита банковского счета
     * @return возвращает hashCode для реквизита банковского счета.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}