package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosComprador extends PageObject {

    public static final Target BOTON_CAMPO_AIRE= Target.the("boton al cliente de espera")
            .located(By.xpath("//*[@class='accordion-toggle collapsed accordion-toggle-active']"));

    public static final Target CAMPO_NOMBRE = Target.the("nombre cliente")
            .located(By.xpath("//*[@id='client-first-name']"));

    public static final Target CAMPO_APELLIDO = Target.the("apeliido cliente")
            .located(By.xpath("//*[@id='client-last-name']"));

    public static final Target CAMPO_CELULAR = Target.the("celular cliente")
            .located(By.xpath("//*[@id='client-phone']"));

    public static final Target CAMPO_DOCUMENTO = Target.the("documento")
            .located(By.xpath("//*[@id='client-new-document']"));

}
