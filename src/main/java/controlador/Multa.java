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
        
        public int Multa1(String placa, int TipoMulta, String estado,int retenido, String desripcion) throws SQLException {
        String sql = "{CALL sp_multa(0, 0, '"+placa+"', "+TipoMulta+", '"+estado+"', " +retenido+ ", '"+desripcion+"')}";
        return ejecutaslq1(sql);
    }
        
        public int Multa3(int id_Multa,String placa, int TipoMulta, Date fechaInfraccion) throws SQLException {
        String sql = "{call sp_Multa(3," +id_Multa+ ", '" +placa+ "', " +TipoMulta+ ", '" +fechaInfraccion+ "')}";
        return ejecutaslq1(sql);
    }
        
        
        public int Multa4(int id) throws SQLException{
            String sql = "{call sp_multa(2, 1, NULL, NULL, NULL, NULL,NULL)}";
            return ejecutaslq1(sql);
        }
        
        public ResultSet visualizarMulta() throws SQLException{
            String sql = "{call sp_multa(3, NULL, NULL, NULL, NULL, NULL, NULL)}";
            r = ejecutaslq(sql);
            return r;
        }
        public ResultSet Cat_Multa() throws SQLException{
        String sql = "{call sp_TipoMulta(5, 0, '', 0)}";
        r= ejecutaslq(sql);      
        return r;
    }
        
        public ResultSet verDatosM(String dato) throws SQLException{
            String sql = "{call obtenerDatos('" +dato+ "', '')}";
            r = ejecutaslq(sql);
            return r;
        }
        
        public ResultSet verMultasP(String placa) throws SQLException{
            String sql = "{call ObtenerMultasPorPlaca('"+placa+"', 'pagado')}";
            r = ejecutaslq(sql);
            return r;
        }
        
        
        public ResultSet verMultasNP(String placa) throws SQLException{
            String sql = "{call ObtenerMultasPorPlaca('"+placa+"', 'no pagado')}";
            r = ejecutaslq(sql);
            return r;
        }
}
