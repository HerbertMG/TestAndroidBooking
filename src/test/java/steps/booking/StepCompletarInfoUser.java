package steps.booking;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import tasks.taskApp.CompletarInfoUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static steps.conf.Hooks.actor;
import static userinterfaces.OverviewPage.BUTTON_FINAL_STEP;


public class StepCompletarInfoUser {

    @Cuando("^complete su informacion con (.*), (.*), (.*), (.*), (.*)$")
    public void completeSuInformacion(String nombre, String apellido, String email, String pais, String telefono) {

        actor.attemptsTo(
                CompletarInfoUser.conDatosUser(nombre,apellido,email,pais,telefono)
        );

    }


    @Entonces("podra visualizar el detalle de su reserva")
    public void podraVisualizarReserva() {
        actor.should(seeThat(the(BUTTON_FINAL_STEP), isPresent()));
    }


}
