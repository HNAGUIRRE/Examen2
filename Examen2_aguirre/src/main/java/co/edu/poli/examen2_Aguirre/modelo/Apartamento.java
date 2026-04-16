package co.edu.poli.examen2_Aguirre.modelo;

import java.util.Date;

public class Apartamento extends Inmueble {

    private int numeroPiso;

    public Apartamento() {}

    public Apartamento(int numero, Date fechaCompra, String estado, Propietario propietario, int numeroPiso) {
        super(numero, fechaCompra, estado, propietario);
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroPiso() { return numeroPiso; }
    public void setNumeroPiso(int numeroPiso) { this.numeroPiso = numeroPiso; }

    public double calcularAdministracion() {
        return numeroPiso * 50000;
    }
}
