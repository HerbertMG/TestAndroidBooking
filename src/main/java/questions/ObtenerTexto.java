package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
@Subject("the text obtained from the #target - ")
public class ObtenerTexto implements Question<String> {

    private Target target;


    public ObtenerTexto(Target target) {
        this.target = target;
    }

    public static ObtenerTexto element(Target target) {
        return Instrumented.instanceOf(ObtenerTexto.class).withProperties(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible())
                        .forNoMoreThan(10)
                        .seconds()
        );
        return Text.of(target).answeredBy(actor);
    }
}
