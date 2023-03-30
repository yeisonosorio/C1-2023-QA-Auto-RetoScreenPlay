package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesion extends PageObject {


    public static final Target BOTON_MI_CUENTA = Target.the("Boton para iniciar sesion")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target BOTON_EMAIL_PASSWORD = Target.the("Boton inicar con usuario y contrasena")
            .located(By.xpath("//div[contains(@class,'vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn')]//button[contains(@type,'button')]"));
    public static final Target CAMPO_EMAIL= Target.the("Campo Email")
            .located(By.xpath("//input[contains(@placeholder,'Ingresa tu email')]"));

    public static final Target CAMPO_PASSWORD= Target.the("Campo Password")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_ENTRAR= Target.the("boton entrar")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));


    public static final Target BOTON_MENOR_PRECIO= Target.the("boton menor precio")
            .located(By.xpath("(//*[@class='bg-light-gray vtex-search-result-3-x-orderByOptionItem vtex-search-result-3-x-orderByOptionItem--selected  c-on-base f5 ml-auto db no-underline pointer tl bn pv4 ph5 w-100 right-0-ns'])"));


}
