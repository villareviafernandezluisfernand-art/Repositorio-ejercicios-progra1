package ejercicio_4;

import java.util.Scanner;

 class Numeros {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n;
            
            System.out.println("=== Numeros del 1 al N ===");
            
            // Validar que N sea un número positivo
            do {
                System.out.print("Ingrese un numero entero positivo N: ");
                n = scanner.nextInt();
                
                if (n <= 0) {
                    System.out.println("Error: el número debe ser mayor que 0. Intente de nuevo.");
                }
            } while (n <= 0);
            
            // Mostrar los números usando un bucle for
            System.out.println("\numeros del 1 al " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                // Separar con coma, excepto el último
                if (i < n) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Salto de línea al final
        }
    }
}
