package org.example.models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PruebaFecha {

    public void probandoFechas(){

        //como crear una fecha:

        //1.Configurar por el usuario
        Integer mes=6;
        Integer anio=1989;
        Integer dia=23;

        LocalDate fechaUsuario=LocalDate.of(anio,mes,dia);
        System.out.println("Naciste el: "+fechaUsuario);

        //2. Configurar por el sistema
        LocalDate fechaSistema=LocalDate.now();
        System.out.println("Hoy es: "+fechaSistema);

        //OPERACIONES COMUNES ENTRE FECHAS
        //Diferencia entre dos fechas
        Long diferenciaDias= ChronoUnit.DAYS.between(fechaUsuario,fechaSistema);
        System.out.println("Han pasado: "+diferenciaDias+" Dias, desde que naciste");

        Long diferenciaMeses= ChronoUnit.MONTHS.between(fechaUsuario,fechaSistema);
        System.out.println("Han pasado: "+diferenciaMeses+" meses, desde que naciste");

        Long diferenciaAnios= ChronoUnit.YEARS.between(fechaUsuario,fechaSistema);
        System.out.println("Han pasado: "+diferenciaAnios+" años, desde que naciste");

        //Obtener los datos especificos de una fecha
        DayOfWeek diaSemana=fechaSistema.getDayOfWeek();
        int diaMes=fechaSistema.getDayOfMonth();
        int diaAnio=fechaSistema.getDayOfYear();
        System.out.println("Para la fecha actual tenemos: ");
        System.out.println(diaSemana);
        System.out.println(diaMes);
        System.out.println(diaAnio);

        //Adicionar o Restar dias a una fecha
        LocalDate fechaNuevaMayor=fechaSistema.plusDays(5);
        LocalDate fechaNuevaMenor=fechaSistema.minusDays(6);
        System.out.println("la fecha nueva en el futuro es: "+fechaNuevaMayor);
        System.out.println("la fecha del pasado es: "+fechaNuevaMenor);

        //Cambiar el formato de una fecha
        DateTimeFormatter formato =DateTimeFormatter.ofPattern("dd/MM/yy");
        String fechaLista=fechaSistema.format(formato);
        System.out.println("fecha original: "+fechaSistema);
        System.out.println("fecha formateada: "+fechaLista);



    }

}
