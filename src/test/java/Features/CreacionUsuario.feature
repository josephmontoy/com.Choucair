Feature: Realizar creacion de un cliente para realizar proceso de Login


Scenario: Crear usuario en plaforma web
  Given Acceder al link de la pagina de choucair
  When Acceder a la seccion Sing in
  And Validar existencia del cliente
  And Diligenciar formulario
  And Enviar solicitud de creacion del cliente
  Then Validar creacion del cliente
