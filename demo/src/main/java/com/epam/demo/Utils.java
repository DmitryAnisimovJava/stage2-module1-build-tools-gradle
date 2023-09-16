package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isPositiveNumber = args.stream().allMatch(x -> Integer.parseInt(x) > 0);
        return isPositiveNumber;
    }
}