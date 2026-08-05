
package mesas;


public class Mesas {
    private Sttring reserva ;
    private int numero_de_mesa;

    public Mesas(Sttring reserva, int numero_de_mesa) {
        this.reserva = reserva;
        this.numero_de_mesa = numero_de_mesa;
    }

    public Sttring getReserva() {
        return reserva;
    }

    public int getNumero_de_mesa() {
        return numero_de_mesa;
    }

    public void setReserva(Sttring reserva) {
        this.reserva = reserva;
    }

    public void setNumero_de_mesa(int numero_de_mesa) {
        this.numero_de_mesa = numero_de_mesa;
    }
    
    
}
