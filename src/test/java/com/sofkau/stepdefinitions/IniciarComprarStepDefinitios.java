package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.log4j.Logger;

import static com.sofkau.tasks.BuscarProducto.buscarProducto;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.SeccionMercado.seccionMercado;
import static com.sofkau.tasks.UbicacionEnvio.ubicacionEnvio;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarComprarStepDefinitios extends Configuracion {


    public static Logger LOGGER = Logger.getLogger(IniciarComprarStepDefinitios.class);


    /**
     *  scenario
     */
    @Given("El usuario inicio sesion en pagina de exito")
    public void elUsuarioInicioSesionEnPaginaDeExito() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }

    @When("Agrega el producto al carrito y procede a comprarlo")
    public void agregaElProductoAlCarritoYProcedeAComprarlo() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("tyeisonferney@gmail.com")
                        .yConLaContrasenna("Tyeisonferney115"),
                ubicacionEnvio(),
                seccionMercado(),
                buscarProducto()
                        .conElProducto("Arroz")





        );
    }

    @Then("Valida que el producto se haya agregado exitosamente")
    public void validaQueElProductoSeHayaAgregadoExitosamente() {

    }


}
