package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarProducto extends PageObject {


    public static final Target CAMPO_BUSCAR_PRODUCTO = Target.the("campo buscar producto")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar en exito.com')]"));

    public static final Target SELECT_PRODUCTO_SUGERIDO = Target.the("campo select prodcuto")
            .located(By.xpath("(//span[@class='b'])[1]"));

    public static final Target BOTON_ORDENAR_POR = Target.the("campo select prodcuto")
            .located(By.xpath("(//span[@class='vtex-search-result-3-x-orderByText c-muted-2'])[1]"));

    public static final Target BOTON_MENOR_PRECIO = Target.the("Ordenar Precio")
            .located(By.xpath("//button[normalize-space()='Menor precio primero']"));


    public static final Target ORDENER_EN_LISTA = Target.the("Ordenar lista")
            .located(By.id("Grupo_15152"));


    public static final Target AUMENTAR_PRODUCTO= Target.the("aumentar producto")
            .located(By.xpath("//*[@class='shelf-exito-vtex-components-buy-button-manager-more]"));


    public static final Target BOTON__BAJAR_ARROZ= Target.the("aumentar producto")
            .located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[1]/section/a/article/div[3]/div[1]/div/img"));


    public static final Target BOTON_ARROZ_BLANCO= Target.the("boton arroz")
            .located(By.xpath("//a[contains(text(), 'arroz blanco')]"));





}
