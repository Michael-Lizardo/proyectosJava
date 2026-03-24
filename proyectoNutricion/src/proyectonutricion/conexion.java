package proyectonutricion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    // 1. Definimos los datos de tu XAMPP 📍
    private String bd = "nutricion"; // El nombre que creamos en phpMyAdmin
    private String url = "jdbc:mysql://localhost:3306/" + bd;
    private String user = "root";
    private String pass = ""; // En XAMPP suele estar vacío
    private Connection con = null;

    // 2. El método que "fabrica" la conexión 🔌
    public Connection getConexion() {
        try {
            // Buscamos el driver que agregamos a las librerías
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Intentamos abrir el puente
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("¡Conexión exitosa! ?");
            
        } catch (ClassNotFoundException | SQLException e) {
            // Si algo falla (XAMPP apagado, error de nombre, etc.)
            System.err.println("Error de conexión: " + e);
        }
        return con;
    }
}