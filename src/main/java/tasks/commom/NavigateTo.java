package tasks.commom;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.HomePageBooking.DESTINATION_BOX;
import static userinterfaces.LogInPage.*;

public class NavigateTo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CLOSE_IDENTITY),
                WaitUntil.the(DESTINATION_BOX, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );

    }
}
