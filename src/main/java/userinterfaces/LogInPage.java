package userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LogInPage {

    public static final Target TITULO_INICIO_SESION = Target.the("Titulo de la pantalla de incio de sesion o registro")
            .located(AppiumBy.id("com.booking:id/identity_header_title"));

    public static final Target BUTTON_CLOSE_IDENTITY = Target.the("Button que permite cerrar la pantalla de inicio de sesion")
            .locatedBy("//android.widget.ImageButton[@content-desc='Navigate up']");
}
