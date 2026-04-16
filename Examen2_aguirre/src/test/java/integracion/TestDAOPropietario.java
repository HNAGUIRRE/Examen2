package integracion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.poli.examen2_Aguirre.servicios.DAOPropietario;
import co.edu.poli.examen2_Aguirre.modelo.Propietario;
public class TestDAOPropietario {

    @Test
    public void testCreatePropietario() {
        DAOPropietario dao = new DAOPropietario();
        Propietario p = new Propietario(2, "Carlos");

        String result = dao.create(p);

        assertEquals("OK", result);
    }
}