package com.mod4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
    public void testSumaValores() {
        
        // Llamar al método que queremos probar
        int res = Sumador.sumaValores(3, 7);

        // Verificar que la salida es la esperada
        int expectedOutput = 10;
        
        Assert.assertEquals(res, expectedOutput);
    }
}
