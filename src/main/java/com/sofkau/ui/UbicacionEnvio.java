package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UbicacionEnvio extends PageObject {


    public static final Target DONDE_ENVIAR = Target.the("boton DONDE ENVIAR")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div[3]/div/div/div/div/span"));


    public static final Target CAMPO_CIUDAD = Target.the("Boton  ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target CAMPO_TIENDA = Target.the("Boton  tienda")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));


    public static final Target BOTON_CONFIRMAR = Target.the("Boton  confirmar")
            .located(By.xpath("//*[@class='exito-geolocation-3-x-primaryButtonEnable']"));


   // public static final Target BOTON_CERRAR = Target.the("Boton  cerrar")
     //       .located(By.xpath("exito-geolocation-3-x-cursorPointer"));


    public static final Target BOTON_CERRAR = Target.the("Boton cerrar")
            .located(By.xpath("//button[normalize-space()='Confirmar']"));


}
