package userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CookiesPage {

    public static final Target TITULO_COOKIES = Target.the("Titulo de la pantalla de configuracion de cookies")
            .located(AppiumBy.id("com.booking:id/gdpr_consent_heading"));

    public static final Target BUTTON_AGREE = Target.the("Button que acepta la configuracion de cookies por defecto")
            .located(AppiumBy.id("com.booking:id/bt_accept"));

    public static final Target BUTTON_SETTINGS = Target.the("Button que permite ir a gestionar la configuracion de cookies")
            .located(AppiumBy.id("com.booking:id/bt_manage_settings"));



}
