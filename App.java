import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.Predicate;
import models.Apple;
import utils.Color;

public class App {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(185, Color.RED),
                new Apple(120, Color.RED));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var greenApples = filter(inventory, (Apple apple) -> apple.getColor().equals(Color.GREEN));
        var heavrWieghtApples = filter(inventory, (Apple apple) -> apple.getWeight() > 150);
        var evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);

        System.out.println(greenApples);
        System.out.println(heavrWieghtApples);
        System.out.println(evenNumbers);

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

}
