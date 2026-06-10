package Trabajo_2;

import java.util.Scanner;


public class Adivinansa {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Juego de Adivinanza ===");
            
            // Jugador 1 ingresa el número secreto
            System.out.print("Jugador 1 - Ingrese el número secreto: ");
            int numeroSecreto = scanner.nextInt();
            
            // Limpiar pantalla visualmente con líneas
            System.out.println("\n".repeat(5));
            System.out.println("¡Número guardado! Ahora le toca al Jugador 2.");
            System.out.println("------------------------------------------");
            
            int intento;
            int intentos = 0;
            
            // Jugador 2 adivina hasta que acierte
            do {
                System.out.print("Jugador 2 - Ingrese su intento: ");
                intento = scanner.nextInt();
                intentos++;
                
                if (intento > numeroSecreto) {
                    System.out.println(">>> El número es MENOR que " + intento + ". ¡Intenta de nuevo!");
                } else if (intento < numeroSecreto) {
                    System.out.println(">>> El número es MAYOR que " + intento + ". ¡Intenta de nuevo!");
                } else {
                    System.out.println("¡¡CORRECTO!! Adivinaste en " + intentos + " intento(s). ¡Felicidades!");
                }
                
            } while (intento != numeroSecreto);
        }
    }
}