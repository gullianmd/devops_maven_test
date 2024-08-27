/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mod4;

/**
 *
 * @author gmard
 */
public class Sumador {
    static void sumaValores(int a, int b){
        
        int res = a+b;
        String resultado = String.format("la suma de %d y %d es %d", a, b, res);
        System.out.println(resultado);
    }
}
