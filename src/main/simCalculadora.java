/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.InfixToPostfix.convInfixToPosfix;

/**
 *
 * @author Sebastián
 */
public class simCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CalculadoraPosfix calc = CalculadoraPosfix.getInstance();
            String cadena = convInfixToPosfix("5*(9+3)/6+5");
            System.out.println(cadena);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
