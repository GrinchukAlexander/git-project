import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    Calc calc=null;

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("BEFORE CLASS");
        calc=new Calc();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("AFTER CLASS");
    }

    @org.junit.Test
    public void sum() {
        int rez=calc.sum(2,5);
        assertTrue("It works",rez==7);
    }

    @org.junit.Test
    public void div() {
        assertEquals("",2, calc.div(10,5));
        //assertEquals(2,calc.div(10,5));
        System.out.println("Division works");
    }

    @Test(expected = ArithmeticException.class)
    public void testDiv(){
        calc.div(10,0);
    }
}