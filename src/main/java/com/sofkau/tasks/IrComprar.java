package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.ui.IrPagar.BOTON_IR_PAGAR;

public class IrComprar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //ir a pagar despues de add el producto al carrito
                Click.on(BOTON_IR_PAGAR)
        );
    }

    public static IrComprar irComprar() {
        return new IrComprar();
    }

}
