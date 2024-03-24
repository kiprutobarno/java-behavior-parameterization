import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import interfaces.Consumer;
import interfaces.Function;
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
        var heavyWeightApples = filter(inventory, (Apple apple) -> apple.getWeight() > 150);
        var evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
        var appleWeights = map(inventory, (Apple a) -> a.getWeight());

        System.out.println(greenApples);
        System.out.println(heavyWeightApples);
        System.out.println(evenNumbers);
        System.out.println(appleWeights);

        forEach(inventory, (Apple a) -> System.out.println(a));

        inventory.sort(Comparator.comparing(apple -> apple.getWeight()));

        System.out.println(inventory);

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

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

}
