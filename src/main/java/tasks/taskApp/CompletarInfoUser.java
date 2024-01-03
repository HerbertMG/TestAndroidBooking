package tasks.taskApp;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import questions.ObtenerTexto;
import tasks.commom.scroll.Scroll;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.containsString;
import static userinterfaces.FillInfoPage.*;
import static userinterfaces.OverviewPage.FINAL_TOTAL_PRICE;
import static utils.Constantes.PRICE_BOOKING;

public class CompletarInfoUser implements Task {

    private String nombre;
    private String apellido;
    private String email;
    private String pais;
    private String telefono;

    public CompletarInfoUser(String nombre, String apellido, String email, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.pais = pais;
        this.telefono = telefono;
    }

    @Override
    @Step("{0} completa campos de informacion de usuario dela reserva")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_FIRST_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(INPUT_FIRST_NAME),
                Enter.theValue(nombre).into(INPUT_FIRST_NAME),
                Enter.theValue(apellido).into(INPUT_LAST_NAME),
                Enter.theValue(email).into(INPUT_EMAIL_ADDRESS),
                Scroll.toElement(),

                Clear.field(INPUT_COUNTRY),
                Enter.theValue(pais).into(INPUT_COUNTRY),

                Clear.field(INPUT_MOBILE_PHONE),
                Enter.theValue(telefono).into(INPUT_MOBILE_PHONE),

                Pause.withDuration(1),
                Click.on(RADIO_BTN_LEISURE)
        );

        actor.should(seeThat(ObtenerTexto.element(TOTAL_PRICE), containsString(actor.recall(PRICE_BOOKING))));

        actor.attemptsTo(
                Click.on(BUTTON_NEXT_STEP),
                Pause.withDuration(5),
                Scroll.toElement()
        );

        actor.should(seeThat(ObtenerTexto.element(FINAL_TOTAL_PRICE), containsString(actor.recall(PRICE_BOOKING))));
    }

    public static CompletarInfoUser conDatosUser(String nombre, String apellido, String email, String pais, String telefono) {
        return instrumented(CompletarInfoUser.class, nombre, apellido, email, pais, telefono);
    }

}
