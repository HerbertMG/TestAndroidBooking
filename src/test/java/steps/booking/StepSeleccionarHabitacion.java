package steps.booking;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import tasks.taskApp.CompletarCampos;
import tasks.taskApp.SeleccionarHabitacion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static steps.conf.Hooks.actor;
import static userinterfaces.FillInfoPage.INPUT_FIRST_NAME;


public class StepSeleccionarHabitacion {

    @Cuando("^selecciona el alojamiento numero (.*) de la lista de resultados$")
    public void seleccionaElAlojamiento(int possRoom) {
        actor.wasAbleTo(
                SeleccionarHabitacion.conPosicion(possRoom)
        );

    }

    @Entonces("podra reservar su habitacion")
    public void podraReservarHabitacion() {
        actor.should(seeThat(the(INPUT_FIRST_NAME), isPresent()));
    }
}
