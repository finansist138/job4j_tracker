package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка.
 * @author ARTEM ARTEMOV
 * @version 1.0
 */
public class User {
    /**
     * Эта модель содержи поля: паспорт пользователя и его ФИО.
     */
    private String passport;
    private String username;

    /**
     * Конструктор принимает на вход два параметра:
     * @param passport содержит псспортные данные пользовтеля
     * @param username содержит ФИО пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить информацию о паспортных данных пользователя
     * @return возвращает паспортные данные пользователя или null если строка пуста.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает на вход паспортные данные пользователя
     * @param passport переопределяет поле паспортнык данные пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить информацию о ФИО пользователя
     *      * @return возвращает ФИО пользователя или null если строка пуста.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает на вход ФИО пользователя
     * @param username переопределяет ФИО пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод позволяет сравнить между собой пользователей банка по паспортным данным
     * @param o - это входящий параметр для сравнения
     * @return возвращает true если паспортные данные равны или false если нет.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод позволяет получить hashCode для паспортных данных пользователя
     * @return возвращает hashCode для паспортных данных пользователя.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}