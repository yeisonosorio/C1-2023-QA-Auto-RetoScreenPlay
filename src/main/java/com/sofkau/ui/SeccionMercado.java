package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeccionMercado extends PageObject {


    public static final Target BOTON_MERCADO = Target.the("boton mercado")
            .located(By.xpath("//span[contains(text(), 'Mercado')]"));


}
