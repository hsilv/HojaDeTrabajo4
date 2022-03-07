/**
 * Clase simCalculadora, sera la encargada de interactuar con el usuario.
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
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
public class simCalculadora
{

    /**
     * @param args the command line arguments
     */
    File archivo;
    FileWriter fw;
    static Scanner sw;
    
    /** 
     * @param args
     */
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
                lectura.close();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\nNo se pudo leer el documento. Por favor, asegurese que la ruta sea la correcta.");
                if(pregunta("\n¿Desea intentar de nuevo?\n1. Si.\n2. No.\nRepuesta:", 2) == 1) buclePrincipal = true;
                else buclePrincipal = false;
            }
        }

    }

    /** 
     * @param pregunta
     * @param opciones
     * @return int
     */
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
