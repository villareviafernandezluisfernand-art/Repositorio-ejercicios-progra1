package Cuenta_regresiva;

import java.util.Scanner;

public class Ejeciocio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor coloque su numero");
        int numero = sc.nextInt();

        while (numero > 0) {
            System.out.println(numero);
            numero--;

        }

    }
}
