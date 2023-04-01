package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IrPagar extends PageObject {


    public static final Target BOTON_IR_PAGAR = Target.the("Campo ir a pagar")
            .located(By.id("cart-to-orderform"));


    //label[@class='form-check-label' and text()='Acepto']


}
