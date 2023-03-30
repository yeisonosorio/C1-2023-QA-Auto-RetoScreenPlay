package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.BuscarProducto.*;
import static com.sofkau.ui.InicioSesion.BOTON_MENOR_PRECIO;

public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto conElProducto(String producto) {
        this.producto = producto;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(CAMPO_BUSCAR_PRODUCTO),
                Enter.theValue(producto).into(CAMPO_BUSCAR_PRODUCTO),
                Click.on(SELECT_PRODUCTO),
                Click.on(BOTON_ORDENAR_POR),
                Click.on(BOTON_MENOR_PRECIO)

        );
    }


    public static BuscarProducto buscarProducto() {
        return new BuscarProducto();
    }
}
