@buyProducts
Feature: Test Cart

  Scenario Outline: Añadir 2 productos
    Given Usuario navega a la pagina principal
    And Dar click boton logIn
    When llenar login "<user>" , "<pass>"
    And Dar click boton login
    When seleccionar primer producto
    And Dar click boton AddCard1
    And regresa a la pagina principal
    When seleccionar segundo producto
    And Dar click boton AddCard2
    And visualizar productos en el carrito
    And Procesa orden
    When llenar formulario "<name>", "<country>", "<city>", "<creditcard>", "<month>", "<year>"
    And Dar click boton confimar compra
    Then Finaliar Compra
    Examples:
      | user     | pass     | name   | country  | city   |  creditcard  | month | year |
      | maria_test | maria_test | Maria  | Ecuador  | Cuenca |  1122334455  | 1150  | 2026 |