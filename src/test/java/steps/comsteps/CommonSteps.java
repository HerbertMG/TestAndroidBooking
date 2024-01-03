package steps.comsteps;


import io.cucumber.java.es.Dado;
import tasks.commom.NavigateTo;

import static steps.conf.Hooks.actor;


public class CommonSteps {


    @Dado("^que un usuario ingresa al home de la aplicacion$")
    public void queUnUsuarioIngresaALaAplicacion() {
        actor.attemptsTo(
                new NavigateTo()
        );

    }
}
