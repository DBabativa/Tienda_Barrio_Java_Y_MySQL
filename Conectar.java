
package maselu;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {
    Connection conectar = null;
    
    public Connection Conexion(){
        String driver= "com.mysql.cj.jdbc.Driver";
        String usuario ="root";
        String contraseña="";
        String base_datos="based";
        String urlbase_datos= "jdbc:mysql://localhost:3306/"+ base_datos;
        try{
            Class.forName(driver);
            conectar = (Connection) DriverManager.getConnection(urlbase_datos, usuario, contraseña);
            conectar.setAutoCommit(false);
            System.out.println("Conexión establecida");
        }catch(Exception e){
            System.out.println("Fallo"+e);
        }
            return conectar;

    }
}
