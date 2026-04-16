package co.edu.poli.examen2_Aguirre.modelo;
import java.util.Date;

	public class Casa extends Inmueble {

	    private int cantidadPisos;

	    public Casa() {}

	    public Casa(int numero, Date fechaCompra, String estado, Propietario propietario, int cantidadPisos) {
	        super(numero, fechaCompra, estado, propietario);
	        this.cantidadPisos = cantidadPisos;
	    }

	    public int getCantidadPisos() { return cantidadPisos; }
	    public void setCantidadPisos(int cantidadPisos) { this.cantidadPisos = cantidadPisos; }

	    public double calcularValor() {
	        return cantidadPisos * 100000000;
	    }
	}
