/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.InfixToPostfix.convInfixToPosfix;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author Sebastián
 */
public class simCalculadora {

    /**
     * @param args the command line arguments
     */
    File archivo;
    FileWriter fw;
    static Scanner sw;
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            CalculadoraPosfix calc = CalculadoraPosfix.getInstance();
            System.out.println("Ingrese la ruta donde se encuentre su archivo (datos.txt no incluye 'datos.txt' en la ruta)");
            String ruta = sc.nextLine();
            ruta = ruta +"\\datos.txt";
            File archivo = new File(ruta);
            ArrayList<String> lista = new ArrayList<String>();
            if(!archivo.exists()){
                System.out.println("Verifique que el archivo exista, se encuentre en la misma carpeta y se llame 'datos.txt'");
            }else{
                sw = new Scanner(archivo);
			    while (sw.hasNextLine()){
                    lista.add(sw.nextLine());
                }				    
            }  
            System.out.print(lista);
            sw.close();
            String menu= "1. ArrayList\n2. Vector\n3. Lista ";
            System.out.println("¿Qué tipo de stack desa utilizar?\n"+menu);
            int respuesta = sc.nextInt();
            for(int i = 0; i<lista.size();i++){
                
                String cadena = convInfixToPosfix(lista.get(i));
                if(respuesta == 1){
                    //trabajar con arraylist
                    System.out.println("El resultado de "+ lista.get(i)+" es: "+calc.Evaluar(cadena, 1));
                }else if(respuesta == 2){
                    //trabajar con vector
                    System.out.println("El resultado de "+ lista.get(i)+" es: "+calc.Evaluar(cadena, 2));
                }else if (respuesta == 3){
                    //trabaja con listas
                    System.out.println("¿Con qué tipo de lista desea trabajar?\n1. Simplemente Encadenada\n2. Doblemente encadenada");
                    int opcion2 = sc.nextInt();
                    if(opcion2 == 1){
                        //lista encadenada
                        System.out.println("El resultado de "+ lista.get(i)+" es: "+calc.Evaluar(cadena, 3));
                    }else if(opcion2 ==2){
                        //lista doblemente encadenada
                        System.out.println("El resultado de "+ lista.get(i)+" es: "+calc.Evaluar(cadena, 4));
                    }else{
                        System.out.println("Opción no válida");
                    }
                }else{
                    System.out.println("Opción no válida");
                }
            }        
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
