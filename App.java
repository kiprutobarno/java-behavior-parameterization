import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Color;
import utils.models.Apple;

public class App {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(185, Color.RED),
                new Apple(120, Color.RED));

        var greenApples = filterGreenApples(inventory, Color.GREEN);

        System.out.println(greenApples);
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory, Color color) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                results.add(apple);
            }
        }
        return results;
    }
}
