package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.TerminosCondiciones.BOTON_PAGAR_FINAL;
import static com.sofkau.ui.TerminosCondiciones.BOTON_PAGO_PSE;


public class PagoFinal implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Click.on(BOTON_PAGO_PSE),
                Click.on(BOTON_PAGAR_FINAL)

        );


    }

    public static PagoFinal pagoFinal() {
        return new PagoFinal();
    }

}
