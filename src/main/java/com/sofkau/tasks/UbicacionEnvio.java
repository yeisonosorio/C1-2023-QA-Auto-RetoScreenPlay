package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static com.sofkau.ui.UbicacionEnvio.*;

public class UbicacionEnvio implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DONDE_ENVIAR),
                Click.on(CAMPO_CIUDAD),
                Hit.the(Keys.ENTER).into(CAMPO_CIUDAD),
                Click.on(CAMPO_ALMACEN),
                Hit.the(Keys.ENTER).into(CAMPO_ALMACEN),
                Click.on(BOTON_CONFIRMAR),
                Click.on(BOTON_CERRAR)
        );


    }


    public static UbicacionEnvio ubicacionEnvio() {
        return new UbicacionEnvio();
    }
}
