package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.DatosComprador.*;


public class DatosComprador implements Task {

    private String nombre;
    private String apellido;
    private String celular;
    private String documento;

    public DatosComprador conElNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DatosComprador yElApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public DatosComprador conElCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public DatosComprador yElDocumento(String documento) {
        this.documento = documento;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(documento).into(CAMPO_DOCUMENTO),
                Enter.theValue(celular).into(CAMPO_CELULAR)

        );

        if (nombre.isEmpty() || apellido.isEmpty()) {
            Enter.theValue(nombre).into(CAMPO_NOMBRE);
            Enter.theValue(apellido).into(CAMPO_APELLIDO);
        }

    }

    public static DatosComprador datosComprador() {
        return new DatosComprador();
    }


}
