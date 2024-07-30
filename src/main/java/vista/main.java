/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import java.sql.SQLException;
import modelo.consulta_Multas;
import modelo.datos_Multa;
import modelo.datos_Vehiculos;
import modelo.gestionUsuarios;
import modelo.visualizar_Multa;
import modelo.visualizar_Vehiculos;

/**
 *
 * @author Lenovo 2024
 */
public class main {
    public static void main(String[] args) throws SQLException {
        /*datos_Vehiculos vi = new datos_Vehiculos();
        vi.cargarVTipos();
        vi.cargarVMarca();
        vi.cargarVModelos();
        vi.setVisible(true);*/
        consulta_Multas con = new consulta_Multas();
        con.setVisible(true);
    }
}
