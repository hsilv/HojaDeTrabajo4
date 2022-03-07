/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import structures.IStack;
import structures.Stack;

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
    public int Evaluar(String expresion, int tipo){
        IStack<Integer> lista= Stack.construir(tipo);
        int resultado = 0;
        int op1 = 0;
        int op2 = 0;
        String[] caracteres = expresion.split("");
        
        for (String caracter: caracteres){
            if(caracter.equals("+") || caracter.equals("-") || caracter.equals("*") || caracter.equals("/") || caracter.equals("^")){
                if(lista.count() <=1){
                    throw new IllegalArgumentException("\nNo se puede realizar la operacion a falta de operadores.");
                }else{
                    op1 = lista.pull();
                    op2 = lista.pull();
                    switch(caracter){
                        case "+":
                            resultado = op1 + op2;
                            break;
                        case "-":
                            resultado = op2 -op1;
                            break;
                        case "*":
                            resultado = op1 * op2;
                            break;
                        case "/":
                            if(op1 == 0){
                                throw new IllegalArgumentException("\nNo se puede realizar la division entre 0.");
                            }else{
                                resultado = op2/op1;
                            }
                            break;
                        case "^":
                            double a = new Double(op2);
                            double b = new Double(op1);
                            resultado = (int) Math.pow(a, b);
                            break;
                    }
                    lista.push(resultado);
                }
            }else
                lista.push(Integer.parseInt(caracter));
        }
        
        return resultado;
    }
}
