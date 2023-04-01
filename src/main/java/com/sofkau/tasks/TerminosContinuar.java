package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.FinalizarCompra.*;

public class TerminosContinuar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_ELIJE_FECHA),
                Click.on(BOTON_ELIJE_FECHA),
                Click.on(BOTON_FECHA),
                Click.on(BOTON_CONTINUAR_PAGO),
                Click.on(BOTON_PAGO_PSE)
        );


    }

    public static TerminosContinuar terminosContinuar() {
        return new TerminosContinuar();
    }

}
