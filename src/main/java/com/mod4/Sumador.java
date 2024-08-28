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
    static int sumaValores(int a, int b){
        
        int res = a+b;
        String resultado = String.format("la suma de %d y %d es %d", a, b, res);
        System.out.println(resultado);
        return res;
    }
        static int restaValores(int a, int b){
        
        int res = a-b;
        String resultado = String.format("la resta de %d y %d es %d", a, b, res);
        System.out.println(resultado);
        return res;
    }
    static int divideValores(int a, int b){
        
        int res = a/b;
        String resultado = String.format("la division entre %d y %d es %d", a, b, res);
        System.out.println(resultado);
        return res;
    }
    static int multiplicaValores(int a, int b){
        
        int res = a*b;
        String resultado = String.format("la multiplicacion entre %d y %d es %d", a, b, res);
        System.out.println(resultado);
        return res;
    }
}
