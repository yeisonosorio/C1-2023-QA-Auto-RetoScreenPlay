package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.SeccionMercado.BOTON_MERCADO;
import static com.sofkau.ui.UbicacionEnvio.*;

public class UbicacionEnvio implements Task {


    private String ubicacion;

    public UbicacionEnvio conLaUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DONDE_ENVIAR),
                Click.on(CAMPO_CIUDAD),
                Hit.the(Keys.ENTER).into(CAMPO_CIUDAD),
                Click.on(CAMPO_TIENDA),
                Hit.the(Keys.ENTER).into(CAMPO_TIENDA),
                Click.on(BOTON_CONFIRMAR),
           Click.on(BOTON_CERRAR)



        );


    }


    public static UbicacionEnvio ubicacionEnvio() {
        return new UbicacionEnvio();
    }
}
