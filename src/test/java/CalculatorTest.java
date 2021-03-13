
import Calculator.Calc;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calc cal = new Calc();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root of number for True Positive", 5.0, cal.squareRoot(25), DELTA);
        assertEquals("Square Root of number for True Positive", 25.0, cal.squareRoot(625), DELTA);
        assertEquals("Square Root of number for True Positive", 11.160645142642965, cal.squareRoot(124.56), DELTA);
        assertEquals("Square Root of number for True Positive", Double.NaN, cal.squareRoot(-100), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of number for False Positive", 11.16, cal.squareRoot(124.56), DELTA);
        assertNotEquals("Square Root of number for False Positive", 1.0, cal.squareRoot(-1), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True positive", 3628800,cal.factorial(10), DELTA);
        assertEquals("Factorial of number for True positive", 120,cal.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 3628801,cal.factorial(10), DELTA);
        assertNotEquals("Factorial of number for False positive", 60,cal.factorial(5), DELTA);
    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Factorial of number for True positive", 1.3862943611198906,cal.naturalLog(4), DELTA);
        assertEquals("Factorial of number for True positive", 2.0794415416798357,cal.naturalLog(8), DELTA);

    }

    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 2,cal.naturalLog(4), DELTA);
        assertNotEquals("Factorial of number for False positive", 3,cal.naturalLog(8), DELTA);
        assertNotEquals("Factorial of number for False positive", 0, cal.naturalLog(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Factorial of number for True positive", 1024,cal.power(2, 10), DELTA);
        assertEquals("Factorial of number for True positive", 100,cal.power(10,2), DELTA);
        assertEquals("Factorial of number for True positive", Double.NaN,cal.power(0,0), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 7,cal.power(2, 3), DELTA);
        assertNotEquals("Factorial of number for False positive", 1,cal.power(0,0), DELTA);
    }

}
