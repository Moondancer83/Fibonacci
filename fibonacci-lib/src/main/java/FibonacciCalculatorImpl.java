import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Moondancer83 on 2016.05.29..
 */
@Service
public class FibonacciCalculatorImpl implements FibonacciCalculator {
    @Override
    public int calculateNthNumber(int index) {
        int proceeding = 0,
            actual = 1;

        for (int i = 1; i < index; i++) {
            int temp = proceeding + actual;
            proceeding = actual;
            actual = temp;
        }

        return actual;
    }

    @Override
    public List<Integer> calculatefirstNNumbers(int index) {
        return null;
    }


}
