package org.example.helpers.generals;

public enum Mensaje {

    NOMBRE_LONGITUD("El nombre ingresado debe tener menos de 70 caracteres"),
    NOMBRE_FORMATO("El nombre solo puede tener letras y espacios")
    ;

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
