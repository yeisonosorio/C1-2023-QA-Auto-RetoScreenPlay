package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import static com.sofkau.ui.DetallesFactura.MENSAJE_FACTURA;

public class DetalleFactura implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_FACTURA.resolveFor(actor).getText();
    }

    public static DetalleFactura detalleFactura() {
        return new DetalleFactura();
    }


}
