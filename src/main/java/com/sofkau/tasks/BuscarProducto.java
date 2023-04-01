package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.BuscarProducto.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto conElProducto(String producto) {
        this.producto = producto;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(CAMPO_BUSCAR_PRODUCTO),
                Click.on(SELECT_PRODUCTO_SUGERIDO),
                Click.on(BOTON_ARROZ_BLANCO),
                Click.on(BOTON_ORDENAR_POR),
                WaitUntil.the(BOTON_MENOR_PRECIO, isPresent()),
                WaitUntil.the(BOTON_MENOR_PRECIO, isCurrentlyVisible()),
                WaitUntil.the(BOTON_MENOR_PRECIO, isCurrentlyEnabled()),
                WaitUntil.the(BOTON_MENOR_PRECIO, isClickable()),
                Click.on(BOTON_MENOR_PRECIO),
                Scroll.to(BOTON__BAJAR_ARROZ),
                Click.on(BOTON__BAJAR_ARROZ)
        );
    }

    public static BuscarProducto buscarProducto() {
        return new BuscarProducto();
    }
}
