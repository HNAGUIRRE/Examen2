
co.edu.poli.examen2_Aguirre.Servicios;
    public String create(Inmueble i) {
        String sql = "INSERT INTO inmueble (numero, fecha, estado, propietario_id) VALUES (?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) { // Uso de try-with-resources
            ps.setInt(1, i.getNumero());
            ps.setDate(2, new java.sql.Date(i.getFechaCompra().getTime()));
            ps.setString(3, i.getEstado());
            ps.setInt(4, i.getPropietario().getId());
            ps.executeUpdate();
            return "OK";
        } catch (Exception e) {
            e.printStackTrace(); // <--- ESTO ES LO MÁS IMPORTANTE
            return "Error: " + e.getMessage();
        }
    }