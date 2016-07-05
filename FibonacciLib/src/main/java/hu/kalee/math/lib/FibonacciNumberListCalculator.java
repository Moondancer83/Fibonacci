package hu.kalee.math.lib;

import java.util.List;

/**
 * Created by Moondancer83 on 2016.05.30..
 */
@FunctionalInterface
public interface FibonacciNumberListCalculator {
    List<Number> calculateFirstNNumbers(int index);
}
