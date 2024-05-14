package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Mensaje;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteValidacion {


    //Inyectando la depedendencia a la clase General
    private General general= new General();

    //la clases de validacion
    //normalmente SOLO TIENEN METODOS
    //CON LA LOGICA DE VALIDACION

    public boolean validarNombres(String nombres) throws Exception{

        //establecer rutinas para validar el campo nombres
        //segun las reglas del negocio

        //1. La cadena del nombre solo puede tener hasta 70 caracteres
        if(nombres.length()>70){ //me pase de caracteres
            throw new Exception(Mensaje.NOMBRE_LONGITUD.getMensaje());
        }
        //2. La cadena del nombre solo puede tener letras aA zZ y espacios
        //pasos para aplicar un REGEX
        String regex="^[a-zA-Z\\s]*$";
        boolean coincidencia=this.general.validarRegex(regex,nombres);
        if(!coincidencia){ //NO HUBO COINCIDENCIA
            throw new Exception(Mensaje.NOMBRE_FORMATO.getMensaje());
        }

        //retorno true si todas las validaciones pasan con exito
        return true;

    }

    public boolean validarCorreo(String correo) throws Exception {
        String regex = "^[a-zA-Z0-9_]+@globant\\.com$";
        Pattern patron= Pattern.compile(regex);
        Matcher coincidencia=patron.matcher(correo);
        if(!coincidencia.matches()){ //NO HUBO COINCIDENCIA
            throw new Exception("El correo debe tener la forma correo@globant.com");
        }

        return true;

    }

    public boolean validarFechaRegistro(LocalDate fechaIngreso){
        return true;
    }

    public boolean validarTelefono(String telefono){
        return true;
    }

}
