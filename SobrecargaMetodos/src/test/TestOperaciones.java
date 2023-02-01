/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author lepo9
 */
public class TestOperaciones {
 
    public static void main(String[] args) {
        /*
        Como los metodos son estaticos, se pueden acceder de manera directa sin crear objetos.
        El contaxto estatico no puede acceder al contexto dinamico, pero el contexto dinamico si puede acceder al contexto estatico.
        */
        
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado = " + resultado2);
        
        /*
        Los tipos de variables en java son:
        byte: 8 bits
        short: 16 bits o 2 bytes
        int: 32 bits o 4 bytes o 2 short
        long: 64 bits o 8 bytes o 4 short o 2 int
        */
        
        
        //El primer parametro es de tipo entero y el segundo es tipo long.
        //Al ser long, se soporta con tipo double por la capacidad de almacenamiento
        var resultado3 = Operaciones.sumar(3,5L);//En este se esta compartiendo un tipo ling de entrada
        System.out.println("resultado3 = " + resultado3);
    }
}
