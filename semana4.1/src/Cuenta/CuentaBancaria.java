package Cuenta;

public class CuentaBancaria {

    // Atributos
    private String numeroCuenta;
    private double saldo;
    private Cliente titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    // Depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Monto: ₡" + monto);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }

    // Retirar dinero
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
        } else if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Monto: ₡" + monto);
        }
    }

    // Consultar saldo
    public double getSaldo() {
        return saldo;
    }

    // Mostrar información de la cuenta
    public void mostrarEstado() {
        System.out.println("=== Estado de Cuenta ===");
        titular.mostrarInfo();
        System.out.println("N° Cuenta: " + numeroCuenta);
        System.out.println("Saldo disponible: ₡" + saldo);
        System.out.println("========================");
    }

    private static class Cliente {

        public Cliente() {
        }

        private void mostrarInfo() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}