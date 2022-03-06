/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.InfixToPostfix.convInfixToPosfix;
import java.util.Scanner;
import structures.*;
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
            String menu= "1. ArrayList\n2. Vector\n3. Lista ";
            System.out.println("¿Qué tipo de stack desa utilizar?\n"+menu);
            int respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    //trabajar con arraylist
                    System.out.println("El resultado de la expresion es: "+calc.Evaluar(cadena, 1));
                    break;
                case 2:
                    //trabajar con vector
                    System.out.println("El resultado de la expresion es: "+calc.Evaluar(cadena, 2));
                    break;
                case 3:
                    //trabajar con lista simple
                    System.out.println("¿Con qué tipo de lista desea trabajar?\n1. Simplemente Encadenada\n2. Doblemente encadenada");
                    int opcion2 = sc.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("El resultado de la expresion es: "+calc.Evaluar(cadena, 3));
                            break;
                        case 2:
                            System.out.println("El resultado de la expresion es: "+calc.Evaluar(cadena, 4));
                            break;
                        default:
                            System.out.println("Opción no válida");
                        break;
                    }
                    break;
                
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
