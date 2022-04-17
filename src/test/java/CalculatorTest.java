import org.iiitb.Calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator myCalculator;

    @Before
    public void setUp(){
        myCalculator = new Calculator();
    }

    @Test
    public void truePositiveSqRoot(){
        double ip1 = 4, ip2=12.25;
        double op1 = 2, op2=3.5;
        assertEquals("Finding square root for True Positive",myCalculator.sqRoot(ip1), op1, 0.2f);
        assertEquals("Finding square root for True Positive",myCalculator.sqRoot(ip2), op2, 0.2f);
    }

    @Test
    public void trueNegativeSqRoot(){
        double ip1 = 16, ip2=125;
        double op1 = 8, op2=12;
        assertNotEquals("Finding square root for True Negative",myCalculator.sqRoot(ip1), op1, 0.2f);
        assertNotEquals("Finding square root for True Negative",myCalculator.sqRoot(ip2), op2, 0.2f);
    }

    @Test
    public void truePositiveFactorial(){
        int ip1 = 4, ip2=5;
        int op1 = 24, op2=120;
        assertEquals("Finding Factorial for True Positive",myCalculator.factorial(ip1), op1, 0.2f);
        assertEquals("Finding Factorial for True Positive",myCalculator.factorial(ip2), op2, 0.2f);
    }

    @Test
    public void trueNegativeFactorial(){
        int ip1 = 4, ip2=5;
        int op1 = 120, op2=100;
        assertNotEquals("Finding Factorial for True Negative",myCalculator.factorial(ip1), op1, 0.2f);
        assertNotEquals("Finding Factorial for True Negative",myCalculator.factorial(ip2), op2, 0.2f);
    }

    @Test
    public void truePositiveNaturalLog(){
        double ip1 = 2.71;
        double op1 = 0.99694;
        assertEquals("Finding Natural Log for True Positive",myCalculator.naturalLog(ip1), op1, 0.2f);
    }

    @Test
    public void trueNegativeNaturalLog(){
        double ip1 = 1;
        double op1 = 2;
        assertNotEquals("Finding Natural Log for True Negative",myCalculator.naturalLog(ip1), op1, 0.2f);
    }

    @Test
    public void truePositivePower(){
        double base1 = 5.5,base2 = 3;
        double exponent1 = 3,exponent2 = 4;
        double op1 = 166.375,op2 = 81;
        assertEquals("Finding Power for True Positive",myCalculator.power(base1, exponent1), op1, 0.2f);
        assertEquals("Finding Power for True Positive",myCalculator.power(base2, exponent2), op2, 0.2f);
    }

    @Test
    public void trueNegativePower(){
        double base1 = 4;
        double exponent1 = 3;
        double op1 = 125;
        assertNotEquals("Finding Power for True Negative",myCalculator.power(base1, exponent1), op1, 0.2f);
    }
}