package mesas_2;

// Esta clase representa una mesa del restaurante
public class Mesa {
    private int numero;
    private boolean reservada;

    public Mesa(int numero) {
        this.numero = numero;
        this.reservada = false; // al crearse, la mesa empieza disponible
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservada() {
        return reservada;
    }

    // Marca la mesa como reservada
    public void reservar() {
        this.reservada = true;
    }

    // Marca la mesa como disponible de nuevo
    public void liberar() {
        this.reservada = false;
    }

    @Override
    public String toString() {
        String estado = reservada ? "Reservada" : "Disponible";
        return "Mesa #" + numero + " - Estado: " + estado;
    }
}

