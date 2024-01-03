#language: es

Característica: Como usuario de Booking, quiero realizar la reserva de alojamiento en un hotel
  disponible en la aplicacion, para separar la estadia en un el hotel de mi prefencia

  Antecedentes: Ingresar a la aplicacion
    Dado que un usuario ingresa al home de la aplicacion


  @EscenarioDeRegresion
  Escenario: [TEST-001] - Validar busqueda de habitación
    Cuando ingresa los datos para la búsqueda de su alojamiento Cusco, desde 14 February 2024 hasta 28 February 2024, 1 habitacion con 2 adultos mas 1 niño de 5 años
    Entonces visualiza la lista de alojamientos disponibles


  @EscenarioDeRegresion
  Escenario: [TEST-002] - Validar alojamiento seleccionable
    Cuando ingresa los datos para la búsqueda de su alojamiento Cusco, desde 14 February 2024 hasta 28 February 2024, 1 habitacion con 2 adultos mas 1 niño de 5 años
    Y selecciona el alojamiento numero 2 de la lista de resultados
    Entonces podra reservar su habitacion

  @EscenarioDeRegresion
  Esquema del escenario: [TEST-003] - Validar el ingreso de datos de cliente
    Cuando ingresa los datos para la búsqueda de su alojamiento Cusco, desde 14 February 2024 hasta 28 February 2024, 1 habitacion con 2 adultos mas 1 niño de 5 años
    Y selecciona el alojamiento numero 2 de la lista de resultados
    Y complete su informacion con <nombre>, <apellido>, <email>, <pais>, <telefono>
    Entonces podra visualizar el detalle de su reserva
    Ejemplos:
      | nombre  | apellido | email                    | pais | telefono  |
      | Herbert | Melendez | emailTest@automation.com | Peru | 978567345 |

  @EscenarioDeRegresion
  Esquema del escenario: [TEST-004] - Validar pago y finalizacion de la reserva
    Cuando ingresa los datos para la búsqueda de su alojamiento Cusco, desde 14 February 2024 hasta 28 February 2024, 1 habitacion con 2 adultos mas 1 niño de 5 años
    Y selecciona el alojamiento numero 2 de la lista de resultados
    Y complete su informacion con <nombre>, <apellido>, <email>, <pais>, <telefono>
    Y complete su informacion de pago con numero de tarjeta <nroCard> y fecha de expiracion <expiracion>
    Entonces se culminara correctamente la reserva
    Ejemplos:
      | nombre  | apellido | email                    | pais | telefono  | nroCard        | expiracion |
      | Herbert | Melendez | emailTest@automation.com | Peru | 978567345 | 36100402606954 | 06/27      |








