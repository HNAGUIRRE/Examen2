package integracion;

import co.edu.poli.examen2_Aguirre.modelo.*;
import co.edu.poli.examen2_Aguirre.servicios.*;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class TestDAOInmueble {

    @Test
    public void testCreateInmueble() {
        DAOInmueble dao = new DAOInmueble();
        Propietario p = new Propietario(2, "Carlos");

        Inmueble i = new Inmueble(200, new Date(), "Usado", p);

        String result = dao.create(i);

        assertEquals("OK", result);
    }
}