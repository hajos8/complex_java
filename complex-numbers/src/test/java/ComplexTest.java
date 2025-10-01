import org.example.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    @Before
    public void setUp() {
        Main.isRunningTests = true;
    }

    @Test
    public void testAdd() {
        Main.testOperation = 1;
        Main.test_aStr = "1+2i";
        Main.test_bStr = "3+4i";
        Main.main(null);
    }

    @Test
    public void testSubtract() {
        Main.testOperation = 2;
        Main.test_aStr = "3+2i";
        Main.test_bStr = "1+4i";
        Main.main(null);
    }

    @Test
    public void testMultiply() {
        Main.testOperation = 3;
        Main.test_aStr = "1+2i";
        Main.test_bStr = "3+4i";
        Main.main(null);
    }

    @Test
    public void testAbs() {
        Main.testOperation = 4;
        Main.test_zStr = "1+2i";
        Main.main(null);
    }

    @Test
    public void testArg() {
        Main.testOperation = 5;
        Main.test_zStr = "1+2i";
        Main.main(null);
    }

    @Test
    public void testBadInput() {
        Main.testOperation = 7;
        Main.main(null);
    }

    @Test
    public void testExit() {
        Main.testOperation = 0;
        Main.main(null);
    }

    @Test
    public void testComplex() {
        Complex c = new Complex("1-2i");

        c.setReal(1.0);
        c.setImag(-2.0);

        c.getReal();
        c.getImag();

    }

    @After
    public void tearDown() {
        Main.isRunningTests = false;
    }
}
