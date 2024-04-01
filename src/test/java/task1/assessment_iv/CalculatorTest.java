package task1.assessment_iv;
import org.junit.Test;
import org.junit.Assert;


public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.subtract(5, 3));
    }
}
