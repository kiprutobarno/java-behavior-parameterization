import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.ApplePredicate;
import models.Apple;
import utils.AppleGreenColorPredicate;
import utils.AppleHeavyWeightPredicate;
import utils.Color;

public class App {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(185, Color.RED),
                new Apple(120, Color.RED));

        var greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        var heavrWieghtApples = filterApples(inventory, new AppleHeavyWeightPredicate());

        System.out.println(greenApples);
        System.out.println(heavrWieghtApples);

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                results.add(apple);
            }
        }
        return results;

    }

}
