package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.SeccionMercado.BOTON_MERCADO;

public class SeccionMercado implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MERCADO)
        );
    }


    public static SeccionMercado seccionMercado() {
        return new SeccionMercado();
    }
}
