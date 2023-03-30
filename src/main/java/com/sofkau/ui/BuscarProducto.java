package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarProducto extends PageObject {


    public static final Target CAMPO_BUSCAR_PRODUCTO = Target.the("campo buscar producto")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar en exito.com')]"));

    public static final Target SELECT_PRODUCTO = Target.the("campo select prodcuto")
            .located(By.xpath("(//span[@class='b'])[1]"));


    public static final Target BOTON_ORDENAR_POR = Target.the("campo select prodcuto")
            .located(By.xpath("(//span[@class='vtex-search-result-3-x-orderByText c-muted-2'])[1]"));


}
