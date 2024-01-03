package steps.booking;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import tasks.taskApp.CompletarCampos;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static steps.conf.Hooks.actor;
import static userinterfaces.RoomPage.SEARCH_RESULT;


public class StepCompletarBusqueda {


    @Cuando("^ingresa los datos para la búsqueda de su alojamiento (.*), desde (.*) hasta (.*), 1 habitacion con 2 adultos mas (.*) niño de (.*) años$")
    public void realizaLaBusquedaDeAlojamientoDisponibleSegun(String ciudad, String checkin, String checkout, String numNino, String edadNino) {
        actor.wasAbleTo(
                CompletarCampos.conDatos(ciudad, checkin, checkout, numNino, edadNino)
        );

    }

    @Entonces("visualiza la lista de alojamientos disponibles")
    public void visualizaLaListaDeAlojamientosDisponibles() {
        actor.should(seeThat(the(SEARCH_RESULT), isPresent()));
    }
}
