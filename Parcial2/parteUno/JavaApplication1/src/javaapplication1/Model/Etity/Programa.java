/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Model.Etity;

import javaapplication1.Conexion.Conexion;
import javaapplication1.Model.Interface.Accion;

/**
 *
 * @author Carlos Suarez
 */
public class Programa implements Accion{
    private Integer id;
    private String tipo_documento ;
    private String nombre_persona;
    private String estado_credito;
    private Double valor_credito;
    
      public Conexion conn = new Conexion();
      
          public Programa() {
          }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getEstado_credito() {
        return estado_credito;
    }

    public void setEstado_credito(String estado_credito) {
        this.estado_credito = estado_credito;
    }

    public Double getValor_credito() {
        return valor_credito;
    }

    public void setValor_credito(Double valor_credito) {
        this.valor_credito = valor_credito;
    }
    
        @Override
    public void Agregar() {
        String sql;

        sql = "INSERT INTO programa ("
                + "tipo_documento, "
                + "nombre_persona, "
                + "estado_credito, "
                + "valor_credito, "
                + ") VALUES ("
                + "' " + this.getTipo_documento()+ "', "
                + "' " + this.getNombre_persona()+ "', "
                + this.getEstado_credito()+ ", "
                + this.getValor_credito()+ ", "
                + " NOW()"
                + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();

    }
    
       @Override
    public void Modificar() {
        String sql;

        sql = "UPDATE programa SET "
                + "tipo_documento = '" + this.getTipo_documento()+ "', "
                + "nombre_persona = '" + this.getNombre_persona()+ "', "
                + "estado_credito = " + this.getEstado_credito()+ ", "
                + "valor_credito = " + this.getValor_credito()+ ", "
                + "updated_at = NOW() "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }
     
      @Override
    public void EliminarFisico() {
        String sql;

        sql = " DELETE FROM programa WHERE id = " + this.getId() + ";";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }
}
