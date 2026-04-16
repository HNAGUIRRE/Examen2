package co.edu.poli.examen2_Aguirre.modelo;

import java.util.Date;

public class Inmueble {
    private int numero;
    private Date fechaCompra;
    private String estado;
    private Propietario propietario;

    // Constructor vacío
    public Inmueble() {}

    // Constructor con parámetros (el que te faltaba)
    public Inmueble(int numero, Date fechaCompra, String estado, Propietario propietario) {
        this.numero = numero;
        this.fechaCompra = fechaCompra;
        this.estado = estado;
        this.propietario = propietario;
    }

    // Getters y Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public Date getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(Date fechaCompra) { this.fechaCompra = fechaCompra; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; }
}