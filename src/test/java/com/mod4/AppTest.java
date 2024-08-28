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
    
    @Test
    public void testSumaValores() {
        
        // Llamar al método que queremos probar
        int res = Sumador.sumaValores(3, 7);

        // Verificar que la salida es la esperada
        int expectedOutput = 10;
        
        Assert.assertEquals(res, expectedOutput);
    }
    
    @Test
    public void testRestaValores() {
        
        // Llamar al método que queremos probar
        int res = Sumador.restaValores(10, 5);

        // Verificar que la salida es la esperada
        int expectedOutput = 5;
        
        Assert.assertEquals(res, expectedOutput);
    }
    
    @Test
    public void testDivideValores() {
        
        // Llamar al método que queremos probar
        int res = Sumador.divideValores(20, 10);

        // Verificar que la salida es la esperada
        int expectedOutput = 2;
        
        Assert.assertEquals(res, expectedOutput);
    }  
    
    @Test
    public void testMultiplicaValores() {
        
        // Llamar al método que queremos probar
        int res = Sumador.multiplicaValores(3, 10);

        // Verificar que la salida es la esperada
        int expectedOutput = 30;
        
        Assert.assertEquals(res, expectedOutput);
    }
}
