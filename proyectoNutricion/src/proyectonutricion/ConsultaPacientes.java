package proyectonutricion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaPacientes extends conexion {

    public boolean registrar(pacientes p) {
        PreparedStatement ps = null;
        Connection con = getConexion(); // 🔌 Usamos el puente de tu clase conexion

        // 📝 La orden de SQL con 11 "huecos"
        String sql = "INSERT INTO pacientes (nombre, edad, sexo, altura, peso, enfermedades, alergias, problemas_digestivos, medicamentos, actividad_fisica, objetivos) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            
            // 📥 Llenamos los huecos con los datos del objeto 'p'
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getEdad());
            ps.setString(3, p.getSexo());
            ps.setDouble(4, p.getAltura());
            ps.setDouble(5, p.getPeso());
            ps.setString(6, p.getEnfermedades());
            ps.setString(7, p.getAlergias());
            ps.setString(8, p.getProblemas_digestivos());
            ps.setString(9, p.getMedicamentos());
            ps.setString(10, p.getActividad_fisica());
            ps.setString(11, p.getObjetivo());
            
            ps.execute(); // 🚀 ¡Fuego! Se manda a la base de datos
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close(); // 🔒 Siempre cerramos la puerta al terminar
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}