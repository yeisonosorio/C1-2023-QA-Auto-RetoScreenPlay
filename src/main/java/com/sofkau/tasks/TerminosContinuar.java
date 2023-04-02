package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static com.sofkau.ui.TerminosCondiciones.*;

public class TerminosContinuar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ACEPTO_TER),
                Click.on(BOTON_CONTINUAR_DATA),
                Scroll.to(BOTON_ELIJE_FECHA),
                Click.on(BOTON_ELIJE_FECHA),
                Click.on(BOTON_FECHA),
                Click.on(BOTON_CONTINUAR_PAGO),
                Scroll.to(BOTON_PAGO_PSE)
        );


    }

    public static TerminosContinuar terminosContinuar() {
        return new TerminosContinuar();
    }

}
