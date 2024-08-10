/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo 2024
 */
public class Usuario extends Conexion{
    ResultSet r;
        public int Usuario0(String cedula, String nombresA, String correo, String direccion, String clave, String rol, String usuario) throws SQLException {
        String sql = "{call sp_Usuario(0, '"+ cedula +"', '"+ nombresA+"', '"+ correo +"', '" + direccion + "', '" + clave + "', '" + rol + "', '" +usuario+ "')}";
        return ejecutaslq1(sql);
    }
        
        public int Usuario1(String cedula, String nombresA, String correo, String direccion, String clave, String rol, String usuario) throws SQLException {
        String sql = "{call sp_Usuario(1, '"+ cedula +"', '"+ nombresA+"', '"+ correo +"', '" + direccion + "', '" + clave + "', '" + rol + "', '" +usuario+ "')}";
        return ejecutaslq1(sql);
    }
        
        public ResultSet Usuario3() throws SQLException{
        String sql = "{call sp_Usuario(3, '', '', '', '', '', '', '')}";
        r= ejecutaslq(sql);      
        return r;
    }
    
        public int Usuario4(String cedula) throws SQLException{
        String sql = "{call sp_Usuario(2, '" +cedula+ "', '', '', '', '', '', '')}";
        return ejecutaslq1(sql);
    }
        
        public ResultSet verificarUsuario(String cedula) throws SQLException{
            String sql = "{call sp_verificarCedula('"+cedula+"')}";
            r = ejecutaslq(sql);
            return r;
        }
}
