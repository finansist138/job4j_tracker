package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель для банковской системы.
 * @author ARTEM ARTEMOV
 * @version 1.0
 */
public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами, у одного пользователя
     * может быть несколько счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в банковскую систему, после проверки на идентичность.
     * @param user содержит объект класса User.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет удалить пользователя из системы по номеру паспорта.
     * @param passport содержит номер паспорта пользователя, которого хотим удалить.
     * @return возвращает true при положительном удалении пользователи или false при отрицательном.
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый счет к пользователю после его поиска по номеру паспорта и проверки
     * на идентичность данного счета.
     * @param passport содержит номер паспорта пользователя, которому добавляем счет.
     * @param account содержит объект класса Account.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод производит поиск пользователя по номеру паспорта.
     * @param passport содержит номер паспорта пользователя, которого пытаемся найти.
     * @return возвращает результат поиска пользователя.
     */
    public User findByPassport(String passport) {

        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам счета.
     * @param passport содержит номер паспорта пользователя, чей счет ищем.
     * @param requisite содержит реквизиты банковского счета пользователя, чей счет ищем.
     * @return возвращает реузьтат поиска счета пользователя.
     */
    public Account findByRequisite(String passport, String requisite) {

        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод производит перечисление денег пользователя с одного счёта на другой счёт после проверки,
     * что данные счета существуют и на первом счете достаточно средств для перевода.
     * @param srcPassport содержит номер паспорта первого пользователя.
     * @param srcRequisite содержит реквизиты банковского счета первого пользователя.
     * @param destPassport содержит номер паспорта второго пользователя.
     * @param destRequisite содержит реквизиты банковского счета второго пользователя.
     * @param amount содержит сумму перевода.
     * @return возвращает true при положительном переводе денежных средств или false, если перевод не удался.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод позволяет получить список счетов пользователя.
     * @param user содержит пользователя, чьи счета необходимо получить.
     * @return возвращает список счетов пользователя.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}