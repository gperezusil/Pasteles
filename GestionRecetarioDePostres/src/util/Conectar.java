
package util;
import java.sql.*;
public class Conectar {
    private Connection con;

    public Conectar() {
        con=null;
    }
    
   //método para realizar la conexion
    public Connection conexion(){
        try {
            //cargamos nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/pasteleria","root","");
        
        }catch (ClassNotFoundException  | SQLException ex) {
            System.out.println("Error de conexion ..." + ex.toString());
        }                
        return con;          
    }
    
}

