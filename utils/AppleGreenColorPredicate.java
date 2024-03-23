package utils;

import interfaces.ApplePredicate;
import models.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
