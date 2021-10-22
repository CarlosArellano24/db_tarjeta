/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db_tarjeta;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Conexion {
    static Connection Conn = null;
    
    public static Connection MySQLConnect() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/db_tarjeta";
            String usuario = "root";
            String pass = "";
            Conn = DriverManager.getConnection(servidor, usuario, pass);
            JOptionPane.showMessageDialog(null, 
                    "Conexión exitosa con la base de datos");
            
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null,
                    "-----------  ERROR ----------"
                    + "\n\nError al conectar con la base de datos",
                    "CONEXIÓN!!!!!", 0);
        }
        
        return Conn;
    }
}
