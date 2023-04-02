package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesFactura  extends PageObject {


    public static final Target MENSAJE_FACTURA = Target.the("nombre cliente")
            .located(By.cssSelector("body div div div div div h3 strong"));



}
