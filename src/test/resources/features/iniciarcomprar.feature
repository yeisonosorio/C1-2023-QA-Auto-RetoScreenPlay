#encoding:UTF-8
#Author: Yeison Ferney Osorio Buitrago


Feature: Iniciar sesion en la pagina del exito y agregar productos al carrito
  yo como usuario de la pagina exito.com
  quiero iniciar sesion para poder usar la pagina
  para poder comprar productos en la página


  @CompraProducto
  Scenario: seleccionar un producto
    Given El usuario inicio sesion en pagina de exito
    When Agrega el producto al carrito y procede a comprarlo
    Then Valida que el producto se haya agregado exitosamente