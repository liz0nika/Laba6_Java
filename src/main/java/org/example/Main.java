package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // тестування TypedCollection
        TypedCollection<String> collection = new TypedCollection<>();

        // додавання елементів
        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        System.out.println("Collection size: " + collection.size());
        System.out.println("Contains 'Two': " + collection.contains("Two"));

        // видалити елементи
        collection.remove("Two");
        System.out.println("After removing 'Two', contains: " + collection.contains("Two"));

        // ітерація через елементи
        for (String item : collection) {
            System.out.println("Item: " + item);
        }

        // конструктор з колекцією
        TypedCollection<Integer> intCollection = new TypedCollection<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Elements in intCollection: " + Arrays.toString(intCollection.toArray()));
    }
}
