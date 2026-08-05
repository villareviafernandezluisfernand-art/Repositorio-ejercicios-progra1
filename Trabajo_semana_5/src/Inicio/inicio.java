package Inicio;

import cuenta.CuentaBancaria;

public class inicio {
    
    public static void main(String[] args) {
        
        CuentaBancaria c1 = new CuentaBancaria("CR11111111","Ronald",1000);
        CuentaBancaria c2 = new CuentaBancaria("CR22222222","Steven",2000);
        CuentaBancaria c3 = new CuentaBancaria("CR33333333","Maria",1500);
        CuentaBancaria c4 = new CuentaBancaria("CR44444444","Andres",3200.50);
        CuentaBancaria c5 = new CuentaBancaria("CR55555555","Fernanda",750.25);
        
        System.out.println(c1.cliente);
        System.out.println("El saldo de cliente 2 es "+ c2.saldo);
        
        System.out.println("El cliente 3 se llama "+ c3.cliente + " y su IBAN es "+ c3.IBAN);
        System.out.println("El saldo de cliente 4 es "+ c4.saldo);
        System.out.println("Cliente 5: "+ c5.cliente + " | Saldo: "+ c5.saldo + " | IBAN: "+ c5.IBAN);
        
        //Probando los metodos de depositar y retirar
        System.out.println("\n--- Movimientos de c1 (Ronald) ---");
        c1.mostrarInfo();
        c1.depositar(500);
        c1.retirar(200);
        c1.retirar(5000); // esto va a fallar por fondos insuficientes
        
        System.out.println("\n--- Movimientos de c3 (Maria) ---");
        c3.mostrarInfo();
        c3.depositar(-100); // esto va a fallar porque el monto es invalido
        c3.depositar(300);
        
    }
}