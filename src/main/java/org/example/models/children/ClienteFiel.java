package org.example.models.children;

import org.example.models.Cliente;

import java.time.LocalDate;

public class ClienteFiel extends Cliente {

    private LocalDate fechaCumpleanos;
    private Integer numeroComprasMes;

    public ClienteFiel() {
    }

    public ClienteFiel(Integer id, String nombres, String correo, LocalDate fechaRegistro, String telefono, LocalDate fechaCumpleanos, Integer numeroComprasMes) {
        super(id, nombres, correo, fechaRegistro, telefono);
        this.fechaCumpleanos = fechaCumpleanos;
        this.numeroComprasMes = numeroComprasMes;
    }

    public LocalDate getFechaCumpleanos() {
        return fechaCumpleanos;
    }

    public void setFechaCumpleanos(LocalDate fechaCumpleanos) {
        this.fechaCumpleanos = fechaCumpleanos;
    }

    public Integer getNumeroComprasMes() {
        return numeroComprasMes;
    }

    public void setNumeroComprasMes(Integer numeroComprasMes) {
        this.numeroComprasMes = numeroComprasMes;
    }
}
