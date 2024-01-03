package steps.exceptions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import questions.ObtenerTexto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.containsString;
import static steps.conf.Hooks.actor;
import static userinterfaces.HomePageBooking.*;


public class StepsBuscarVacio {

    @Cuando("^se realice la busqueda sin ingresar la ciudad de destino$")
    public void realizaBusquedaSinCiudad() {

        actor.should(seeThat(the(DESTINATION_BOX), isPresent()));

        actor.attemptsTo(
                Click.on(BUTTON_SEACRH)
        );
    }


    @Entonces("^deberá visualizar el mensaje de (.*)$")
    public void mensajeAlerta(String alerta) {
        actor.should(seeThat(ObtenerTexto.element(ALERT_ERROR), containsString(alerta)));
    }
}
