package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static com.sofkau.ui.InicioSesion.*;

public class IniciarSesion implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

        Properties propiedades= null;

        try {
            propiedades = carga();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BOTON_MI_CUENTA),
                Click.on(BOTON_EMAIL_PASSWORD),
                Enter.theValue(propiedades.getProperty("serenity.username")).into(CAMPO_EMAIL),
                Enter.theValue(propiedades.getProperty("serenity.password")).into(CAMPO_PASSWORD),
                Click.on(BOTON_ENTRAR),
                Click.on(BOTON_CERRAR_MODAL)

        );
    }

    public static IniciarSesion iniciarSesion() {
        return new IniciarSesion();
    }



    public Properties carga() throws IOException {
        Properties propiedades = new Properties();
        FileInputStream archivo = new FileInputStream("src\\test\\resources\\serenity.properties");
        propiedades.load(archivo);
        return propiedades;
    }
}
