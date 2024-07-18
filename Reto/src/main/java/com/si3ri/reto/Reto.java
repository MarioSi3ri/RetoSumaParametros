/* PROGRAMA DE UN MÉTODO (CON MAVEN) */

package com.si3ri.reto;

public class Reto {
    public int suma(int valor1, int valor2){ // "Suma" recibe dos parámetros de tipo "int" llamados "valor1" y "valor2".
        return valor1 + valor2; // Retorna el valor de la variable ("resultado").
    }
    public static void main(String[] args) {
        Reto reto = new Reto(); // La variable "reto" es una instancia de la clase "Reto".
        int resultado = reto.suma (10, 5); // El resultado de la suma se guarda en la variable "resultado".
        
        System.out.println("\nEl resultado es: " + resultado);
    }
}
