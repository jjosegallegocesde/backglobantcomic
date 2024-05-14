package org.example;

import org.example.models.Cliente;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //intentar agregar un nombre al CLiente desde la consola
        Scanner lea = new Scanner(System.in);

        System.out.print("Digita el nombre del cliente: ");
        cliente.setNombres(lea.nextLine());



    }
}