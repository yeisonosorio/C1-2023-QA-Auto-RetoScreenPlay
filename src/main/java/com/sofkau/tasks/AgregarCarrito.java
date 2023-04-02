package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.ui.AgregarCarrito.*;

public class AgregarCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AGREGAR_CARRITO),
                Click.on(SELECT_ICON_CARRITO)
        );
    }


    public static AgregarCarrito agregarCarrito() {
        return new AgregarCarrito();
    }

}
