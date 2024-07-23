/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Lenovo 2024
 */
public class Multa extends Conexion{    
    ResultSet r;    
        
        public int Multa1(String placa, int TipoMulta, Date fechaInfraccion) throws SQLException {
        String sql = "{call sp_Multa(1,0, '" +placa+ "', " +TipoMulta+ ", '" +fechaInfraccion+ "')}";
        return ejecutaslq1(sql);
    }
        
        public int Multa3(int id_Multa,String placa, int TipoMulta, Date fechaInfraccion) throws SQLException {
        String sql = "{call sp_Multa(3," +id_Multa+ ", '" +placa+ "', " +TipoMulta+ ", '" +fechaInfraccion+ "')}";
        return ejecutaslq1(sql);
    }
        
        
        public int Multa4(int id) throws SQLException{
            String sql = "{call sp_Multa(4, " +id+ ", '', 0, null)}";
            return ejecutaslq1(sql);
        }
        
        public ResultSet visualizarMulta() throws SQLException{
            String sql = "{call sp_Multa(5, 0, '', 0, null)}";
            r = ejecutaslq(sql);
            return r;
        }
        public ResultSet Cat_Multa() throws SQLException{
        String sql = "{call sp_TipoMulta(5, 0, '', 0)}";
        r= ejecutaslq(sql);      
        return r;
    }
}
