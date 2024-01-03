package tasks.taskApp;


import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import tasks.commom.scroll.Scroll;
import tasks.commom.scroll.ScrollByIdAndText;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static userinterfaces.HomePageBooking.*;

public class CompletarCampos implements Task {

    private String ciudad;
    private String checkin;
    private String checkout;
    private String numNino;
    private String edadNino;

    public CompletarCampos(String ciudad, String checkin, String checkout, String numNino, String edadNino) {
        this.ciudad = ciudad;
        this.checkin = checkin;
        this.checkout = checkout;
        this.numNino = numNino;
        this.edadNino = edadNino;
    }

    @Override
    @Step("{0} completa campos para la busqueda")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(// Buscar la ciudad
                WaitUntil.the(DESTINATION_BOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DESTINATION_BOX),
                Enter.theValue(ciudad).into(DESTINATION_BOX_INPUT),
                WaitUntil.the(DESTINATION_FINAL, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DESTINATION_FINAL)
        );
        actor.attemptsTo( //Seleccionar fechas
                WaitUntil.the(CALENDAR_LIST, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                //Click.on(CALENDAR_LIST),
                Scroll.toElement(),
                Pause.withDuration(2),
                Click.on(CHECK_IN.of(checkin)),
                Click.on(CHECK_OUT.of(checkout)),

                Pause.withDuration(2),
                Click.on(BUTTON_DATE_CONFIRMATION)
        );

        actor.attemptsTo( //Seleccionar habitaciones y personas
                WaitUntil.the(OCCUPANCY_BOX, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OCCUPANCY_BOX),
                WaitUntil.the(BUTTON_ADD_CHILD, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_ADD_CHILD),

                //Realizamos un scroll para encontrar la edad correcta
                ScrollByIdAndText.toFindTheParameters("android:id/numberpicker_input", edadNino),
                Click.on(BUTTON_AGE_OK),

                //Aplicamos los cambios
                WaitUntil.the(BUTTON_APPLY, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_APPLY),

                //Realizamos la busqueda
                WaitUntil.the(BUTTON_SEACRH, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_SEACRH),

                Pause.withDuration(5)

        );

    }

    public static CompletarCampos conDatos(String ciudad, String checkin, String checkout, String numNino, String edadNino) {
        return instrumented(CompletarCampos.class, ciudad, checkin, checkout, numNino, edadNino);
    }


}
