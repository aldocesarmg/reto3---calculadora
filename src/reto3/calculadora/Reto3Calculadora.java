
package reto3.calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3Calculadora {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String respuesta;
        double valor1, valor2,resultado;
        System.out.println("¿Qué operación desea realizar?");
        respuesta = entrada.readLine();
        System.out.println("Digita el primer número:");
        valor1 = Double.parseDouble(entrada.readLine());
        System.out.println("Digita el segundo número:");
        valor2 = Double.parseDouble(entrada.readLine());
        
        switch(respuesta){
            case "Suma":
            case "suma":
                resultado = valor1+valor2;
                System.out.println("El resultado de la operación "+valor1+" + "+valor2+" es igual a "+resultado);
                break;
            case "Resta":
            case "resta":
                resultado = valor1-valor2;
                System.out.println("El resultado de la operación "+valor1+" - "+valor2+" es igual a "+resultado);
                break;
            case "Multiplicacion":
            case "multiplicacion":
                resultado = valor1*valor2;
                System.out.println("El resultado de la operación "+valor1+" x "+valor2+" es igual a "+resultado);
                break;
            case "Division":
            case "division":
                resultado = valor1/valor2;
                System.out.println("El resultado de la operación "+valor1+" ÷ "+valor2+" es igual a "+resultado);
                break;
            default:
                System.out.println("Ha habido un error");
                break;
        }
    }
    
}
