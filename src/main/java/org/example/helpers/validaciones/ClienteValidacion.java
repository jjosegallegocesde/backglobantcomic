package org.example.helpers.validaciones;

import java.time.LocalDate;

public class ClienteValidacion {

    //la clases de validacion
    //normalmente SOLO TIENEN METODOS
    //CON LA LOGICA DE VALIDACION

    public boolean validarNombres(String nombres){
        return true;
    }

    public boolean validarCorreo(String correo){
        return true;
    }

    public boolean validarFechaRegistro(LocalDate fechaIngreso){
        return true;
    }

    public boolean validarTelefono(String telefono){
        return true;
    }
    
}
