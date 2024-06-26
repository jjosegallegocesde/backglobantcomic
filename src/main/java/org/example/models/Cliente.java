package org.example.models;

import org.example.helpers.validaciones.ClienteValidacion;

import java.time.LocalDate;

public class Cliente {

    //ID
    private Integer id;
    //NOMBRE Y APELLIDO (QUE SOLO SE PUEDAN LETRAS Y ESPACIOS Y MAXIMO 70 CARACTERES)
    private String nombres;
    //CORREO
    private String correo;
    //FECHA DE REGISTRO (YYYY/MM/DD) SE RECOMIENDA USAR LA CLASE LOCAL DATE
    private LocalDate fechaRegistro;
    //TELEFONO (DEBE TENER 10 DIGITOS)
    private String telefono;

    //inyectando una dependencia de la clase clientevalidacion
    private ClienteValidacion clienteValidacion=new ClienteValidacion();

    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String correo, LocalDate fechaRegistro, String telefono) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id>0){
            this.id=id;
        }else{
            System.out.println("Revise ya que no se aceptan id negativos");
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try{
            this.clienteValidacion.validarNombres(nombres);
            this.nombres=nombres;
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
      try {
          this.clienteValidacion.validarCorreo(correo);
          this.correo= correo;
      }
      catch (Exception error){
          System.out.println(error.getMessage());
      }
    }


    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
