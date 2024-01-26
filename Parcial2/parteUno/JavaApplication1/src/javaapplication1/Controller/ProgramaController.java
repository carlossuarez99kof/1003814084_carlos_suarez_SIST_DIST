/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javaapplication1.Model.Etity.Programa;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Suarez
 */
public class ProgramaController {
      public void GuardarRegistro(String tipo_documento, String nombre_persona, String estado_credito, Double valor_credito) {

        try {
            Programa request = new Programa();
            request.setNombre_persona(nombre_persona);
            request.setTipo_documento(tipo_documento);
            request.setEstado_credito(estado_credito);
            request.setValor_credito(valor_credito);
           
            request.Agregar();
            JOptionPane.showMessageDialog(null, "Registro almacendo con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No fue posible guardar el registro, consulte con el administrador.");
        }
    }

    public void ModificarRegistro(Integer id,String tipo_documento, String nombre_persona, String estado_credito, Double valor_credito) {
        Programa request = new Programa();
            request.setId(id);
            request.setNombre_persona(nombre_persona);
            request.setTipo_documento(tipo_documento);
            request.setEstado_credito(estado_credito);
            request.setValor_credito(valor_credito);
        request.Modificar();
    }

    public void EliminarRegistro(Integer id) {
        Programa request = new Programa();
        request.setId(id);
        request.EliminarFisico();
    } 
}
