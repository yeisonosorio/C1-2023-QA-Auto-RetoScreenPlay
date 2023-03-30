package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.InicioSesion.*;

public class IniciarSesion implements Task {


    private String usuario;
    private String contrasenna;

    public IniciarSesion conElUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public IniciarSesion yConLaContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MI_CUENTA),
                Click.on(BOTON_EMAIL_PASSWORD),
                Click.on(CAMPO_EMAIL),
                Enter.theValue(usuario).into(CAMPO_EMAIL),
                Click.on(CAMPO_PASSWORD),
                Enter.theValue(contrasenna).into(CAMPO_PASSWORD),
                Click.on(BOTON_ENTRAR)

        );
    }

    public static IniciarSesion iniciarSesion() {
        return new IniciarSesion();
    }
}
