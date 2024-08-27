package IACC_DEV.d2024;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testSend3()
    {
        int number = SendNumber.send3();
        
        int expected = 3;
        
        boolean assertion = number == expected;
        
        assertTrue(assertion);
        
        
    }
}
