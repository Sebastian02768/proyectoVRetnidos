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
public class Pago extends Conexion{
    ResultSet r;
    
    public int pago1(int multa, String metodo, String tarjeta, Double monto) throws SQLException{
        String sql = "{call sp_Pago(1, 0, " +multa+", '" +metodo+ "', '" +tarjeta+ "', " +monto+ ")}";
        return ejecutaslq1(sql);
    }
    
    public int pago2(int id, int multa, String metodo, String tarjeta, Double monto) throws SQLException{
        String sql = "{call sp_Pago(3, " +id+ ", " +multa+", '" +metodo+ "', '" +tarjeta+ "', " +monto+ ")}";
        return ejecutaslq1(sql);
    }
    
}
