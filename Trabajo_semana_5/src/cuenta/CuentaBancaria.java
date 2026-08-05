package cuenta;


public class CuentaBancaria {
    //Atributos
    public String cliente; 
    public double saldo;
    public String IBAN;
    
    //Constructor
    public CuentaBancaria(String IBAN,String cliente,double saldo){
        this.cliente  = cliente; 
        this.IBAN = IBAN;
        this.saldo = saldo;
    }
    
    //Metodo para depositar dinero a la cuenta
    public void depositar(double monto){
        if(monto > 0){
            this.saldo = this.saldo + monto;
            System.out.println("Deposito exitoso. Nuevo saldo: "+ this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0");
        }
    }
    
    //Metodo para retirar dinero de la cuenta
    public void retirar(double monto){
        if(monto <= 0){
            System.out.println("El monto a retirar debe ser mayor a 0");
        } else if(monto > this.saldo){
            System.out.println("Fondos insuficientes. Saldo actual: "+ this.saldo);
        } else {
            this.saldo = this.saldo - monto;
            System.out.println("Retiro exitoso. Nuevo saldo: "+ this.saldo);
        }
    }
    
    //Metodo para mostrar la informacion de la cuenta
    public void mostrarInfo(){
        System.out.println("Cliente: "+ this.cliente + " | IBAN: "+ this.IBAN + " | Saldo: "+ this.saldo);
    }
    
}