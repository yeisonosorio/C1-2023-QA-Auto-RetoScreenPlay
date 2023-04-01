package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.sofkau.ui.FinalizarCompra.*;

public class FinalizarCompra implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ACEPTO_TER),
                //Click.on(BOTON_AUTORIZO_DATOS),
                Click.on(BOTON_CONTINUAR_DATA),
                Click.on(BOTON_CONTINUAR_DATA)

        );


    }

    public static FinalizarCompra finalizarCompra() {
        return new FinalizarCompra();
    }


}
