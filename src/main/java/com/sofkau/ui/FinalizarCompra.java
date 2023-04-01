package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FinalizarCompra extends PageObject {


    public static final Target BOTON_ACEPTO_TER = Target.the("boton acepta")
            .located(By.xpath("(//input[contains(@type, 'checkbox')])[3]"));


    public static final Target BOTON_AUTORIZO_DATOS = Target.the("boton acepta")
            .located(By.xpath("(//input[contains(@type, 'checkbox')])[4]"));


    public static final Target BOTON_CONTINUAR_DATA = Target.the("boton continuar con la compra")
            .located(By.id("go-to-shipping"));


    public static final Target BOTON_ELIJE_FECHA = Target.the("boton continuar con la compra")
            .located(By.xpath("//button[@class='vtex-omnishipping-1-x-dateLink shp-datepicker-button scheduled-delivery-choose' and text()='Elija una fecha de entrega']"));

    //boton para eligir una fecha del calendario para recoger el pedido
    public static final Target BOTON_FECHA = Target.the("boton continuar con la compra")
            .located(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--003' and text()='3']"));


    public static final Target BOTON_CONTINUAR_PAGO = Target.the("boton continuar con la compra")
            .located(By.xpath("//button[@id='btn-go-to-payment']"));


    public static final Target BOTON_PAGO_PSE = Target.the("boton continuar con la compra")
            .located(By.xpath("//*[span='PSE']"));


}


