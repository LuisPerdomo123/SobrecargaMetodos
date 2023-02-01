/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author lepo9
 */
public class Operaciones {
    
    
    
    public static int sumar(int a, int b){
    
        System.out.println("sumar(int a, int b)");
        return a + b;
    }
    
    /*
    Para la sobrecarga de metodos, se puede realizar el cambio de tipo de metodo y argumentos
    */
    public static double sumar(double a, double b){
    
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}
