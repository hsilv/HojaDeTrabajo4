/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.InfixToPostfix.convInfixToPosfix;

import java.util.Scanner;

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
        boolean buclePrincipal = true;
        String ruta = "";
        String linea = "";
        int respuesta = 0;
        String cadena = "";
        Scanner scanner = new Scanner(System.in);
        CalculadoraPosfix calc = CalculadoraPosfix.getInstance();
        
        while(buclePrincipal)
        {
            System.out.println("\nPor favor, ingrese la ruta de su archivo de tipo texto.");
            ruta = scanner.nextLine();
            ruta = ruta + "\\datos.txt";
            try {
                File texto = new File(ruta);
                Scanner lectura = new Scanner(texto);
                int i = 1;
                respuesta = pregunta("\n¿Qué tipo de stack desa utilizar?\n1. ArrayList\n2. Vector\n3. Lista\nRespuesta", 3);
                switch (respuesta) {
                    case 1:
                    System.out.println("\n---Resolviendo utilizando ArrayList---");
                    System.out.println("\nNo. linea\tInfix\t\tPostix\t\tResultado");
                    while(lectura.hasNextLine())
                    {
                        try {
                            linea = lectura.nextLine();
                            cadena = convInfixToPosfix(linea);
                            System.out.println(i + ".\t\t" + linea + "\t\t" + cadena + "\t\t" + calc.Evaluar(cadena, 1));
                        } catch (Exception e) {
                            System.out.println(i + ".\t\t" + linea + "\t\tLa expresion no esta escrita correctamente.");
                        }
                        i++;
                    }
                        break;

                    case 2:
                    System.out.println("\n---Resolviendo utilizando Vectores---");
                    System.out.println("\nNo. linea\tInfix\t\tPostix\t\tResultado");
                    while(lectura.hasNextLine())
                    {
                        try {
                            linea = lectura.nextLine();
                            cadena = convInfixToPosfix(linea);
                            
                            System.out.println(i + ".\t\t" + linea + "\t\t" + cadena + "\t\t" + calc.Evaluar(cadena, 2));
                        } catch (Exception e) {
                            System.out.println(i + ".\t\t" + linea + "\t\tLa expresion no esta escrita correctamente.");
                        }
                        i++;
                    }  
                        break;

                    case 3:
                    respuesta = pregunta("\n¿Con qué tipo de lista desea trabajar?\n1. Simplemente Encadenada\n2. Doblemente encadenada\nRespuesta: ", 2);
                    if(respuesta == 1)
                    {
                        System.out.println("\n---Resolviendo utilizando Lista Simplemente Encadenada---");
                        System.out.println("\nNo. linea\tInfix\t\tPostix\t\tResultado");
                        while(lectura.hasNextLine())
                        {
                            try {
                                linea = lectura.nextLine();
                                cadena = convInfixToPosfix(linea);
                                
                                System.out.println(i + ".\t\t" + linea + "\t\t" + cadena + "\t\t" + calc.Evaluar(cadena, 3));
                            } catch (Exception e) {
                                System.out.println(i + ".\t\t" + linea + "\t\tLa expresion no esta escrita correctamente.");
                            }
                            i++;
                        }
                    }
                    else
                    {
                        System.out.println("\n---Resolviendo utilizando Lista Doblemente Encadenada---");
                        System.out.println("\nNo. linea\tInfix\t\tPostix\t\tResultado");
                        while(lectura.hasNextLine())
                        {
                            try {
                                linea = lectura.nextLine();
                                cadena = convInfixToPosfix(linea);
                                
                                System.out.println(i + ".\t\t" + linea + "\t\t" + cadena + "\t\t" + calc.Evaluar(cadena, 4));
                            } catch (Exception e) {
                                System.out.println(i + ".\t\t" + linea + "\t\tLa expresion no esta escrita correctamente.");
                            }
                            i++;
                        }
                    }
                        break;
                
                    default:
                        break;
                }
                buclePrincipal = false;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\nNo se pudo leer el documento. Por favor, asegurese que la ruta sea la correcta.");
                if(pregunta("\n¿Desea intentar de nuevo?\n1. Si.\n2. No.\nRepuesta:", 2) == 1) buclePrincipal = true;
                else buclePrincipal = false;
            }


            /*
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

                
                for(int i = 0; i<lista.size();i++){
                    System.out.println("¿Qué tipo de stack desa utilizar para la línea "+(i+1)+"?\n"+menu);
                    int respuesta = sc.nextInt();
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
            }*/
        }

    }

    public static int pregunta(String pregunta, int opciones)
    {
        boolean bucle = true;
        int respuesta = 0;
        Scanner scanner = new Scanner(System.in);
        try 
        {
            while(bucle)
            {
                System.out.println(pregunta);
                respuesta = scanner.nextInt();
                scanner.nextLine();
                if(respuesta > 0 && respuesta <= opciones) bucle = false;
                else System.out.println("\nRepuesta no valida.\n");
            }    
        } catch (Exception e) {
            System.out.println("\nRepuesta no valida. Ingrese solamente numeros.\n");
            respuesta = pregunta(pregunta, opciones);
        }
        return respuesta;
    } 

}
