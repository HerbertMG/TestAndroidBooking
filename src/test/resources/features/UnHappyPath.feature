#language: es

Característica: Como usuario de Booking deseo realizar la reserva de alojamiento en un hotel
  disponible en la aplicacion

  Antecedentes: Ingresar a la aplicacion
    Dado que un usuario ingresa al home de la aplicacion

  @EscenarioDeRegresion @TestException
  Escenario: [TEST-005] - Validar que no permita buscar sin ciudad de destino
    Cuando se realice la busqueda sin ingresar la ciudad de destino
    Entonces deberá visualizar el mensaje de Please enter your destination