package steps.booking;

import interactions.Pause;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import tasks.taskApp.PagarReserva;

import static steps.conf.Hooks.actor;
import static userinterfaces.PaymentPage.BUTTON_BOOK_NOW;


public class StepPagarReserva {

    @Cuando("^complete su informacion de pago con numero de tarjeta (.*) y fecha de expiracion (.*)$")
    public void completeSuInformacionDePago(String cardNum, String expDate) {
        actor.attemptsTo(
                PagarReserva.conCard(cardNum,expDate)
        );
    }


    @Entonces("se culminara correctamente la reserva")
    public void culminaReserva() {
        actor.attemptsTo(
                Click.on(BUTTON_BOOK_NOW),
                Pause.withDuration(20)
        );

    }
}