
import Calculator.Calc;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-10;
    Calc cal;

    @Before
    public void setUp() throws Exception {
        this.cal = new Calc();
    }


    @Test
    public void squareRoot_All_Should_Match (){
        assertEquals("Square Root of number to match", 5.0, cal.squareRoot(25), DELTA);
        assertEquals("Square Root of number to match", 25.0, cal.squareRoot(625), DELTA);
        assertEquals("Square Root of number to match", 11.160645142642965, cal.squareRoot(124.56), DELTA);
        assertEquals("Square Root of number to match", Double.NaN, cal.squareRoot(-100), DELTA);
    }

    @Test
    public void squareRoot_Should_Not_Match(){
        assertNotEquals("Square Root of number not matching", 11.16, cal.squareRoot(124.56), DELTA);
        assertNotEquals("Square Root of number not matching", 1.0, cal.squareRoot(-1), DELTA);
    }

    @Test
    public void factorial_Should_Match(){
        assertEquals("Factorial of number to match", 3628800,cal.factorial(10), DELTA);
        assertEquals("Factorial of number to match", 120,cal.factorial(5), DELTA);
    }

    @Test
    public void factorial_Should_Not_Match(){
        assertNotEquals("Factorial of number not matching", 3628801,cal.factorial(10), DELTA);
        assertNotEquals("Factorial of number not matching", 60,cal.factorial(5), DELTA);
    }

    @Test
    public void natural_Log_Should_Match(){
        assertEquals("Natural log of number to match", 1.3862943611198906,cal.naturalLog(4), DELTA);
        assertEquals("Natural log of number to match", 2.0794415416798357,cal.naturalLog(8), DELTA);

    }

    @Test
    public void natural_Log_Should_Not_Match(){
        assertNotEquals("Natural log of number not matching", 2,cal.naturalLog(4), DELTA);
        assertNotEquals("Natural log of number not matching", 3,cal.naturalLog(8), DELTA);
        assertNotEquals("Natural log of number not matching", 0, cal.naturalLog(0), DELTA);
    }

    @Test
    public void power_Should_Match(){
        assertEquals("Power for to match", 1024,cal.power(2, 10), DELTA);
        assertEquals("Power for to match", 100,cal.power(10,2), DELTA);
        assertEquals("Power for to match", Double.NaN,cal.power(0,0), DELTA);
    }

    @Test
    public void power_Should_Not_Match(){
        assertNotEquals("Power not matching", 7,cal.power(2, 3), DELTA);
        assertNotEquals("Power not matching", 1,cal.power(0,0), DELTA);
    }

}
