package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.sofkau.ui.AgregarCarrito.*;

public class AgregarCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(

                    Click.on(AGREGAR_CARRITO),
                    Click.on(SELECT_ICON_CARRITO)
            );
        } catch (Exception e) {
            // excepción en caso de que el elemento no esté disponible
            System.out.println("El botón agregar al carrito no está disponible.");
            e.printStackTrace();

        }

    }




    public static AgregarCarrito agregarCarrito() {
        return new AgregarCarrito();
    }

}
