package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("finansist138@mail.ru", "Artemov Artem Artemovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
