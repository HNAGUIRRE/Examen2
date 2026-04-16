package co.edu.poli.examen2_Aguirre.controlador;

import co.edu.poli.examen2_Aguirre.modelo.Propietario;
import co.edu.poli.examen2_Aguirre.servicios.CRUD;
import co.edu.poli.examen2_Aguirre.servicios.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Controlador implements CRUD<Propietario> {

    private Connection con = ConexionBD.getInstancia().getConexion();

    @Override
    public String create(Propietario p) {
        try {
            String sql = "INSERT INTO propietario (id, nombre) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());

            ps.executeUpdate();

            return "OK";

        } catch (Exception e) {
            e.printStackTrace(); // 👈 IMPORTANTE para ver el error real
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