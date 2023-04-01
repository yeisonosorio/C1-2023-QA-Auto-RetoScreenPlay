package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesFactura  extends PageObject {


    public static final Target MENSAJE_FACTURA = Target.the("nombre cliente")
            .located(By.xpath("//*[strong='Detalles de tu compra']"));



}
