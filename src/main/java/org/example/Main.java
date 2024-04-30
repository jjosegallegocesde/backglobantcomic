package org.example;

import org.example.models.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Cliente clienteDos=new Cliente(-20,"Bruno Diaz",
                "themasterwayne@hotmail.com", LocalDate.now(),
                "3225962363");

        //llenando con el set la propiedad id del objeto anemico
        cliente.setId(-56);

        //mostrando el id del cliente:
        //mostrando el correo del cliente:
        System.out.println("El cliente 1 tiene el id: "+cliente.getId());


    }
}