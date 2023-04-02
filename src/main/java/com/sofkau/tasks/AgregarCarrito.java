package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.AgregarCarrito.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AgregarCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AGREGAR_CARRITO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(AGREGAR_CARRITO),
                WaitUntil.the(SELECT_ICON_CARRITO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(SELECT_ICON_CARRITO)
        );
    }


    public static AgregarCarrito agregarCarrito() {
        return new AgregarCarrito();
    }

}
