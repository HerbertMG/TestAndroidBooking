package tasks.taskApp;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import tasks.commom.scroll.Scroll;
import questions.ObtenerTexto;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.containsString;
import static userinterfaces.RoomPage.*;
import static utils.Constantes.PRICE_BOOKING;

public class SeleccionarHabitacion implements Task {

    private int posRoom;
    private String possRoomString;

    public SeleccionarHabitacion(int posRoom) {
        this.posRoom = posRoom;
    }

    private String convertRoom(int posRoomInt){
        int temp = 2; //(posRoomInt+1);
        return String.valueOf(temp);
    }

    @Override
    @Step("{0} selecciona habitacion a reservar")
    public <T extends Actor> void performAs(T actor) {
        possRoomString = convertRoom(posRoom);
        actor.attemptsTo(
                WaitUntil.the(SEARCH_RESULT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Scroll.toElement(),
                Click.on(SELECT_RESULT.of(possRoomString)),
                Scroll.toElement(),
                WaitUntil.the(PRICE_TEXT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Pause.withDuration(5)
        );

        String priceBooking = PRICE_TEXT.resolveFor(actor).getText();
        actor.remember(PRICE_BOOKING, priceBooking);

        actor.attemptsTo(
                Pause.withDuration(5),
                WaitUntil.the(BUTTON_SELECT_ROOM, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                Pause.withDuration(5),
                Click.on(BUTTON_SELECT_ROOM)

        );

        actor.should(seeThat(ObtenerTexto.element(SUB_TOTAL_PRICE_TEXT), containsString(actor.recall(PRICE_BOOKING))));

        actor.attemptsTo(
                Pause.withDuration(5),
                WaitUntil.the(BUTTON_SELECT_ROOM_OPTION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_SELECT_ROOM_OPTION),
                WaitUntil.the(BUTTON_RESERVE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_RESERVE),
                Pause.withDuration(2)
        );
    }

    public static SeleccionarHabitacion conPosicion(int posRoom) {
        return instrumented(SeleccionarHabitacion.class, posRoom);
    }
}
