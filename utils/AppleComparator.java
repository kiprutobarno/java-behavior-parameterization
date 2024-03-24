package utils;

import java.util.Comparator;

import models.Apple;

public class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple a, Apple b) {
        return a.getWeight().compareTo(b.getWeight());
    }

}
