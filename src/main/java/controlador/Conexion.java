/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo conexion de mysql
 */
public class Conexion {
    private String server;
    private String BDD;
    private String usuario;
    private String clave;
    Connection conn;
    private ResultSet r;
   
    public void get_parametros1(){
        server="jdbc:mysql://localhost:3306/";
        BDD="cuyago3ro";
        usuario="root";
        clave="1234";
        
    }
     public void get_parametros2(){
        server="jdbc:mysql://10.10.16.128:3306/";
        BDD="cuarto";
        usuario="root";
        clave="root";
        
    }
    /* public Connection getConectar(){
         Connection con;
         try {
             get_parametros1();
             con=DriverManager.getConnection(server + BDD, usuario , clave);
             JOptionPane.showMessageDialog(null,"Conexion Exitosa a "+BDD);
             return con;
         } catch (SQLException e) {
             System.out.println(e.toString());
         }
         return null;
     }
    public ResultSet ejecutar(String SQl){
        ResultSet resultado = null;
        Statement st;
        try {
            st = getConectar().createStatement();
            resultado = st.executeQuery(SQl);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, SQl);
        }
        return resultado;
    }*/
     
     
         public void conectar() throws SQLException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proyectodeaula3ro?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "1234");
            System.out.println("Conexión Exitosa");
        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
         
         public void desconectar() throws SQLException{
             try {
                 conn.close();
             } catch (SQLException e) {
                 Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, BDD);
                 conn.close();
             }
         }

    // Método para ejecutar una consulta SQL
public ResultSet ejecutaslq(String SQL) throws SQLException {
       conectar();
       Statement st;
       st = conn.createStatement();
       r = st.executeQuery(SQL);
        return r;
       
    }

   public int ejecutaslq1(String SQL) throws SQLException {
    conectar();
    Statement st = conn.createStatement();
    int result = st.executeUpdate(SQL);
    st.close();
    return result;
}
} 

