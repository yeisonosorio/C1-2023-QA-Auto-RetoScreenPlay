package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UbicacionEnvio extends PageObject {


    public static final Target DONDE_ENVIAR = Target.the("boton DONDE ENVIAR")
            .located(By.xpath("//span[@class='exito-geolocation-3-x-addressResult']"));


    public static final Target CAMPO_CIUDAD = Target.the("Boton  ciudad")
            .located(By.xpath("(//input[@aria-autocomplete='list'])[1]"));

    public static final Target CAMPO_ALMACEN = Target.the("Boton  almacen")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));


    public static final Target BOTON_CONFIRMAR = Target.the("Boton  confirmar")
            .located(By.xpath("//*[@class='exito-geolocation-3-x-primaryButtonEnable']"));


    public static final Target BOTON_CERRAR = Target.the("Boton cerrar")
            .located(By.xpath("//*[name()='path' and contains(@data-name,'Path 373')]"));


}
