package co.edu.poli.examen2_Aguirre.servicios;

import co.edu.poli.examen2_Aguirre.modelo.Propietario;
import java.sql.*;

public class DAOPropietario implements CRUD<Propietario> {

    private Connection con = ConexionBD.getInstancia().getConexion();

    @Override
    public String create(Propietario p) {
        try {
            String sql = "INSERT INTO propietario (nombre) VALUES (?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, p.getNombre());

            ps.executeUpdate();

            // 🔥 Obtener ID generado automáticamente
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setId(rs.getInt(1));
            }

            return "OK";

        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @Override
    public Propietario readOne(int id) {
        return null;
    }

    @Override
    public java.util.List<Propietario> readAll() {
        return null;
    }
}