package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarCarrito extends PageObject {

    public static final Target SELECT_ICON_CARRITO= Target.the("seleccion carrito")
            .located(By.xpath("//*[@class='exito-header-3-x-minicartQuantity']"));

    public static final Target AGREGAR_CARRITO = Target.the("agregar al carrito")
            .located(By.xpath("(//*[@class='exito-vtex-components-4-x-buttonDataContainer flex justify-center'])[1]"));

    // add al carrito tiene problemas
}
