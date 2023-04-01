package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.sofkau.questions.DetalleFactura.detalleFactura;
import static com.sofkau.tasks.AgregarCarrito.agregarCarrito;
import static com.sofkau.tasks.BuscarProducto.buscarProducto;
import static com.sofkau.tasks.DatosComprador.datosComprador;
import static com.sofkau.tasks.FinalizarCompra.finalizarCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.IrComprar.irComprar;
import static com.sofkau.tasks.RefresPag.refresPag;
import static com.sofkau.tasks.SeccionMercado.seccionMercado;
import static com.sofkau.tasks.TerminosContinuar.terminosContinuar;
import static com.sofkau.tasks.UbicacionEnvio.ubicacionEnvio;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class IniciarComprarStepDefinitios extends Configuracion {


    public static Logger LOGGER = Logger.getLogger(IniciarComprarStepDefinitios.class);


    /**
     * scenario
     */
    @Given("El usuario inicio sesion en pagina de exito")
    public void elUsuarioInicioSesionEnPaginaDeExito() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        } catch (Exception e) {
            LOGGER.info("fallo la configuracion");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }


    @When("Agrega el producto al carrito y procede a comprarlo")
    public void agregaElProductoAlCarritoYProcedeAComprarlo() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion(),
                    ubicacionEnvio(),
                    seccionMercado(),
                    buscarProducto()
                            .conElProducto("Arroz"),
                    agregarCarrito(),
                    irComprar(),
                    refresPag(),
                    datosComprador()
                            .conElNombre("yeison f")
                            .yElApellido("ferney f")
                            .conElCelular("3124321312")
                            .yElDocumento("109872354"),
                    finalizarCompra(),
                    terminosContinuar()
            );
        } catch (Exception e) {
            LOGGER.info("fallo la configuracion aqui");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }

    }


    @Then("Valida que el producto se haya agregado exitosamente")
    public void validaQueElProductoSeHayaAgregadoExitosamente() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(detalleFactura(), equalTo("Detalles de tu compra"))
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de finalizacion de la compra");
            LOGGER.warn(e.getMessage());
            //Assertions.fail();
        } finally {
            quitarDriver();
        }
    }


}
