package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> example = new HashMap<>();
        example.put("example@ex.ru", "Ivan Petrov");
        for (Map.Entry<String, String> entry : example.entrySet())  {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
