/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.InfixToPostfix.convInfixToPosfix;
import java.util.Scanner;
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
            Scanner sc = new Scanner(System.in);
            String menu= "1. ArrayList\n2. Vector\n3. Lista simple\n4. Lista doblemente encadenada";
            System.out.println("¿Qué tipo de stack desa utilizar?\n"+menu);
            int respuesta = sc.nextInt();
            sc.next();
            switch (respuesta) {
                case 1:
                    //trabajar con arraylist
                    break;
                case 2:
                    //trabajar con vector
                    break;
                case 3:
                    //trabajar con lista simple
                    break;
                case 4:
                    //trabajar con lista doblemente encadenada
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
