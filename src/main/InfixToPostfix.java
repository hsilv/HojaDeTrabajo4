/**
 * Clase InfixToPosfix, sera la encargada de la "traduccion" de las expresiones infix a posfix
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
 */
package main;

import structures.StackUsingArrayList;

/**
 *
 * @author Sebastián
 */
public class InfixToPostfix
{

    /**
     *
     * @param s
     * @return
     * @throws main.InfixToPostfix.ExceptionInfixToPosfix
     */
    public static String convInfixToPosfix(String s) throws ExceptionInfixToPosfix {
        String temp = "";
        StackUsingArrayList<Character> stack = new StackUsingArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>= 'a' && c<= 'z' || c>= 'A' && c<= 'Z'){
                throw new ExceptionInfixToPosfix("Expresion invalida");
            } else if (c>= '0' && c<= '9'){
                temp = temp+c;
            } else if (c == '('){
                stack.push(c);
            } else if (c == ')'){
                while(stack.peek() != '('){
                    temp = temp+stack.pull();
                }
                stack.pull();
            } else if(c == '+'||c == '*'||c == '-'||c == '/'||c == '^'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    if(prioridad(c) <= prioridad(stack.peek())){
                        temp = temp+stack.pull();
                    }
                    else if(prioridad(c) >= prioridad(stack.peek())){
                        temp = temp+stack.pull();
                    }
                }
                stack.push(c);
            }
        }
        if (!stack.isEmpty()) {
            for (int z = 0; z < stack.count() + 1; z++) {
                char sign = stack.pull();
                if (sign != '(' && sign != ')') {
                    temp = temp + sign;
                }
                
            }
        }
        return temp;
    }

    /** 
     * @param c
     * @return int
     */
    public static int prioridad(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return 1;
        }
    }

    private static class ExceptionInfixToPosfix extends Exception
    {

        public static final long serialVersionUID = 700L;

        public ExceptionInfixToPosfix(String mensaje)
        {
            super(mensaje);
        }
    }
}
