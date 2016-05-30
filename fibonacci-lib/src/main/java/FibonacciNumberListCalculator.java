import java.util.List;

/**
 * Created by Marci on 2016.05.30..
 */
@FunctionalInterface
public interface FibonacciNumberListCalculator {
    List<Integer> calculateFirstNNumbers(int index);
}
