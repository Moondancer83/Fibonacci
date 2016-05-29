import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FibonacciCalculatorImplTest extends TestCase {

    private FibonacciCalculator underTest;

    public void setUp() throws Exception {
        underTest = new FibonacciCalculatorImpl();
    }

    @Test
    public void testCalculateNthNumberShouldReturn1ForFirstNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(1);

        // THEN
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCalculateNthNumberShouldReturn1ForSecondNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(2);

        // THEN
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCalculateNthNumberShouldReturn2ForThirdNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(3);

        // THEN
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    public void testCalculateNthNumberShouldReturn3ForFourthNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(4);

        // THEN
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    public void testCalculateNthNumberShouldReturn5ForFifthNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(5);

        // THEN
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    public void testCalculateNthNumberShouldReturn55ForTenthNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(10);

        // THEN
        Assertions.assertThat(actual).isEqualTo(55);
    }

    @Test
    public void testCalculateNthNumberShouldReturn5ForFourtysixthNumber() {
        // GIVEN
        // WHEN
        int actual = underTest.calculateNthNumber(46);

        // THEN
        Assertions.assertThat(actual).isEqualTo(1836311903);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateNthNumberShouldThrowInvalidArgumentExceptionWhen0OrLessIsGiven() {
        // GIVEN
        // WHEN
        underTest.calculateNthNumber(47);

        // THEN
        Assertions.fail("Should throw illegalArgumentException.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateNthNumberShouldThrowInvalidArgumentExceptionWhen47OrBiggerIsGiven() {
        // GIVEN
        // WHEN
        underTest.calculateNthNumber(47);

        // THEN
        Assertions.fail("Should throw illegalArgumentException.");
    }
}