
package reto3.calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3Calculadora {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String respuesta;
        double valor1, valor2;
        System.out.println("¿Qué operación desea realizar?");
        respuesta = entrada.readLine();
        
        switch(respuesta){
            case "Suma":
            case "suma":
                
                break;
            case "Resta":
            case "resta":
                
                break;
            case "Multiplicacion":
            case "multiplicacion":
                
                break;
            case "Division":
            case "division":
                
                break;
        }
    }
    
}
