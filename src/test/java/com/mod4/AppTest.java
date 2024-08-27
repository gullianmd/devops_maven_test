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
        // Configurar para capturar la salida del sistema
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Llamar al método que queremos probar
        Sumador.sumaValores(3, 7);

        // Restaurar la salida original del sistema
        System.setOut(originalOut);

        // Verificar que la salida es la esperada
        String expectedOutput = "la suma de 3 y 7 es 10\r\n";
        
        Assert.assertEquals(expectedOutput, outContent.toString());
    }
}
