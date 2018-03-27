import org.junit.Before;

import static org.junit.Assert.*;

public class NumberTest {

    Number number=null;
    @org.junit.Test
    public void sum() {
        int i=number.sum(5);
        assertEquals(15,i);
    }

    @Before
    public void setup(){
        number=new Number();
    }
}