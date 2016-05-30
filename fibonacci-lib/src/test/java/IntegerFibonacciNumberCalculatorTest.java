import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.regex.Matcher;

public class IntegerFibonacciNumberCalculatorTest extends TestCase {

    private IntegerFibonacciNumberCalculator underTest;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public void setUp() throws Exception {
        underTest = new IntegerFibonacciNumberCalculator();
    }

    @Test
    public void testCalculateNthNumberShouldReturn1ForFirstNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(1);

        // THEN
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCalculateNthNumberShouldReturn1ForSecondNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(2);

        // THEN
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCalculateNthNumberShouldReturn2ForThirdNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(3);

        // THEN
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    public void testCalculateNthNumberShouldReturn3ForFourthNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(4);

        // THEN
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    public void testCalculateNthNumberShouldReturn5ForFifthNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(5);

        // THEN
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    public void testCalculateNthNumberShouldReturn55ForTenthNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(10);

        // THEN
        Assertions.assertThat(actual).isEqualTo(55);
    }

    @Test
    public void testCalculateNthNumberShouldReturn5ForFourtysixthNumber() {
        // GIVEN
        // WHEN
        Integer actual = underTest.calculateNthNumber(46);

        // THEN
        Assertions.assertThat(actual).isEqualTo(1836311903);
    }

    @Test
    public void testCalculateNthNumberShouldThrowInvalidArgumentExceptionWhen0OrLessIsGiven() {
        // GIVEN
        IllegalArgumentException expected = new IllegalArgumentException("Index shuold be between 1 and 46.");
        thrown.expectCause(Is.is(expected));

        try {
            // WHEN
            underTest.calculateNthNumber(0);
            fail("expected IllegalArgumentException for index > 46");
        } catch (IllegalArgumentException ex) {
            // THEN
            Assertions.assertThat(ex.getMessage()).isEqualTo("Index should be between 1 and 46.");
        }
    }

    @Test
    public void testCalculateNthNumberShouldThrowInvalidArgumentExceptionWhen47OrBiggerIsGiven() {
        // GIVEN
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Index should be between 1 and 46.");

        try {
            // WHEN
            underTest.calculateNthNumber(47);
            fail("expected IllegalArgumentException for index > 46");
        } catch (IllegalArgumentException ex) {
            // THEN
            Assertions.assertThat(ex.getMessage()).isEqualTo("Index should be between 1 and 46.");
        }
    }

    @Test
    public void testCalculateFirstNNumbersShouldThrowInvalidArgumentExceptionWhen0OrLessIsGiven() {
        // GIVEN
        IllegalArgumentException expected = new IllegalArgumentException("Index shuold be between 1 and 46.");
        thrown.expectCause(Is.is(expected));

        try {
            // WHEN
            underTest.calculateFirstNNumbers(0);
            fail("expected IllegalArgumentException for index > 46");
        } catch (IllegalArgumentException ex) {
            // THEN
            Assertions.assertThat(ex.getMessage()).isEqualTo("Index should be between 1 and 46.");
        }
    }

    @Test
    public void testCalculateFirstNNumbersShouldThrowInvalidArgumentExceptionWhen47OrBiggerIsGiven() {
        // GIVEN
        IllegalArgumentException expected = new IllegalArgumentException("Index shuold be between 1 and 46.");
        thrown.expectCause(Is.is(expected));

        try {
            // WHEN
            underTest.calculateFirstNNumbers(47);
            fail("expected IllegalArgumentException for index > 46");
        } catch (IllegalArgumentException ex) {
            // THEN
            Assertions.assertThat(ex.getMessage()).isEqualTo("Index should be between 1 and 46.");
        }
    }

    @Test
    public void testCalculateFirstNNumbersShoulsNotReturnNull() {
        // GIVEN
        // WHEN
        List<Integer> aczual = underTest.calculateFirstNNumbers(1);

        // THEN
        Assertions.assertThat(aczual).isNotNull();
    }

    @Test
    public void testCalculateFirstNNumbersShouldReturnOneElementWhen1IsGiven() {
        // GIVEN
        // WHEN
        List<Integer> actual = underTest.calculateFirstNNumbers(1);

        // THEN
        Assertions.assertThat(actual).hasSize(1);
        Assertions.assertThat(actual.get(0)).isEqualTo(1);
    }



    @Test
    public void testCalculateFirstNNumbersShouldReturnfiveElementsWhen5IsGiven() {
        // GIVEN
        // WHEN
        List<Integer> actual = underTest.calculateFirstNNumbers(5);

        // THEN
        Assertions.assertThat(actual).hasSize(5);
        Assertions.assertThat(actual.get(4)).isEqualTo(5);
    }
}