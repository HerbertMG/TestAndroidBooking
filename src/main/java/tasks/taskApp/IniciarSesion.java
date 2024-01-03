package tasks.taskApp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePageBooking.DESTINATION_BOX;
import static userinterfaces.LogInPage.*;

public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TITULO_INICIO_SESION, WebElementStateMatchers.isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_CLOSE_IDENTITY),
                WaitUntil.the(DESTINATION_BOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );

    }

    public static IniciarSesion conOmitir(){
        return instrumented(IniciarSesion.class);
    }
}
