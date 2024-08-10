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
public class Vehiculo extends Conexion{
    ResultSet r;
        public int Vehiculo1(String cedulaPropietario, String tipoV, String placa, String marca, String modelo, int anio, String color) throws SQLException {
        String sql = "{call sp_Vehiculo(0, '" +cedulaPropietario+ "', '" +tipoV+ "', '" +placa+ "', '" +marca+ "', '" +modelo+ "', " +anio+ ", '" +color+ "')}";
        return ejecutaslq1(sql);
    }
        
        public int Vehiculo3(String cedulaPropietario, String tipoV, String placa, String marca, String modelo, int anio, String color, Boolean vRetenido) throws SQLException {
        String sql = "{call sp_Vehiculo(3, '" +cedulaPropietario+ "', '" +tipoV+ "', '" +placa+ "', '" +marca+ "', '" +modelo+ "', " +anio+ ", '" +color+ "', " +vRetenido+ ")}";
        return ejecutaslq1(sql);
    }
        
        public ResultSet Vehiculo5() throws SQLException{
        String sql = "{call sp_vehiculo(3, '', '', '', '', '', 0, '')}";
        r= ejecutaslq(sql);      
        return r;
    }
    
        public int Vehiculo4(String placa) throws SQLException{
        String sql = "{call sp_vehiculo(2, '', '', '" +placa+ "', '', '', 0, '')}";
        return ejecutaslq1(sql);
    }
        
        public ResultSet CatalogoV(int op) throws SQLException{
        String sql = "{call sp_TiposVehiculos(" +op+ ")}";
        r= ejecutaslq(sql);      
        return r;
    }
        
        public ResultSet verDatos(String cedula) throws SQLException{
            String sql = "{call sp_consultaVehiculo(1, '"+cedula+"', '')}";
            r = ejecutaslq(sql);
            return r;
        }
        
        public ResultSet verDatos1(String placa) throws SQLException{
            String sql = "{call sp_consultaVehiculo(2, '', '"+placa+"')}";
            r = ejecutaslq(sql);
            return r;
        }
        
        public ResultSet verVehiculos(String placa) throws SQLException{
            String sql = "{call sp_vehiculo(4, '', '', '" +placa+ "', '', '', 0, '')}";
            r = ejecutaslq(sql);
            return r;
        }
}
