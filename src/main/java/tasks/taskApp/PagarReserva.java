package tasks.taskApp;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import questions.ObtenerTexto;
import tasks.commom.scroll.Scroll;

import static interactions.HideKeyboard.theActorHidesKeyboard;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.containsString;
import static userinterfaces.FillInfoPage.INPUT_FIRST_NAME;
import static userinterfaces.OverviewPage.BUTTON_FINAL_STEP;
import static userinterfaces.OverviewPage.FINAL_TOTAL_PRICE;
import static userinterfaces.PaymentPage.*;
import static utils.Constantes.PRICE_BOOKING;


public class PagarReserva implements Task {

    private String cardNum;
    private String expDate;


    public PagarReserva(String cardNum, String expDate) {
        this.cardNum = cardNum;
        this.expDate = expDate;
    }

    @Override
    @Step("{0} seleciona pago con tarjeta de credito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_FINAL_STEP),
                WaitUntil.the(INPUT_CREDIT_CARD, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(INPUT_CREDIT_CARD),
                Enter.theValue(cardNum).into(INPUT_CREDIT_CARD),
                Click.on(INPUT_EXPIRATION_DATE),
                Enter.theValue(expDate).into(INPUT_EXPIRATION_DATE),
                Scroll.toElement(),
                theActorHidesKeyboard()
        );

        //Continuar deslizando
        actor.attemptsTo(
                Scroll.toElement(),
                Pause.withDuration(1),
                Scroll.toElement()
        );

        //Validar Precio Final
        actor.should(
                seeThat(
                        ObtenerTexto.element(FINAL_TOTAL_PRICE),
                        containsString(actor.recall(PRICE_BOOKING))
                )
        );
    }

    public static PagarReserva conCard(String cardNum, String expDate) {
        return instrumented(PagarReserva.class, cardNum, expDate);
    }
}
