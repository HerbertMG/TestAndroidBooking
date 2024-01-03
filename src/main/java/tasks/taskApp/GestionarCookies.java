package tasks.taskApp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CookiesPage.*;

public class GestionarCookies implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TITULO_COOKIES, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_AGREE)
        );

    }

    public static GestionarCookies conAceptar() {
        return instrumented(GestionarCookies.class);
    }

}
