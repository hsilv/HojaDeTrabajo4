/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sebastián
 */
public class CalculadoraPosfix {
    private static CalculadoraPosfix calc;
    private CalculadoraPosfix(){
        System.out.println("Se creara una unica calculadora");
    } 
    
    public static CalculadoraPosfix getInstance(){
        if(calc == null){
            calc = new CalculadoraPosfix();
        } else{
            System.out.println("Ya se ha creado una calculadora antes");
        }
        return calc;
    }
}
