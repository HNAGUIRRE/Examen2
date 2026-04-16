package unitaria;

import co.edu.poli.examen2_Aguirre.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestInmueble {

    @Test
    public void testCalcularCasa() {
        Casa casa = new Casa();
        casa.setCantidadPisos(3);

        double valor = casa.calcularValor();

        assertTrue(valor > 0);
    }

    @Test
    public void testApartamento() {
        Apartamento apto = new Apartamento();
        apto.setNumeroPiso(5);

        double admin = apto.calcularAdministracion();

        assertTrue(admin > 0);
    }
}