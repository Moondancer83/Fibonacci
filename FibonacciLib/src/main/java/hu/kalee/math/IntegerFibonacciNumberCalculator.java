package hu.kalee.math;

import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moondancer83 on 2016.05.29..
 */
@Service
public class IntegerFibonacciNumberCalculator implements FibonacciNthNumberCalculator, FibonacciNumberListCalculator {
    @Override
    public Integer calculateNthNumber(int index) {
        assertIndexBound(index);

        Integer previous = 0,
                actual = 1;

        for (int i = 1; i < index; i++) {
            Pair<Integer, Integer> temp = calculateNext(previous, actual);
            previous = temp.getFirst();
            actual = temp.getSecond();
        }

        return actual;
    }

    @Override
    public List<Integer> calculateFirstNNumbers(int index) {
        assertIndexBound(index);

        List<Integer> result = new ArrayList<>();
        Integer previous = 0,
                actual = 1;

        result.add(actual);
        for (int i = 1; i < index; i++) {
            Pair<Integer, Integer> temp = calculateNext(previous, actual);
            previous = temp.getFirst();
            actual = temp.getSecond();
            result.add(actual);
        }

        return result;
    }

    /**
     * Asserts index bound regarding to possible result.
     * Default Fibonacci sequence is not including numbers with index under 1.
     * This implementation results integer type numbers what maximizes the output number in Integer.MAX.
     *
     * @param index of requested number
     */
    private void assertIndexBound(int index) {
        if (index < 1 || index > 46) {
            throw new IllegalArgumentException("Index should be between 1 and 46.");
        }
    }

    private Pair<Integer, Integer> calculateNext(Integer previous, Integer actual) {
        int temp = previous + actual;
        previous = actual;
        actual = temp;
        return Pair.of(previous, actual);
    }
}
