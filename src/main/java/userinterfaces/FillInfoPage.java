package userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class FillInfoPage {

    public static final Target INPUT_FIRST_NAME = Target.the("Input de Primer nombre")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_firstname_value']/android.widget.EditText");
    public static final Target INPUT_LAST_NAME = Target.the("Input de Segundo Nombre")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_lastname_value']/android.widget.EditText");
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Input email")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_email_value']/android.widget.EditText");
    public static final Target INPUT_ADDRESS = Target.the("Input direccion")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_address_value']/android.widget.EditText");
    public static final Target INPUT_ZIP_CODE = Target.the("Input ZIP code")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_zipcode_value']/android.widget.EditText");
    public static final Target INPUT_CITY = Target.the("Input ciudad")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_city_value']/android.widget.EditText");
    public static final Target INPUT_COUNTRY = Target.the("Input Pais")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_country_value']/android.widget.EditText");
    public static final Target INPUT_MOBILE_PHONE = Target.the("Input telefono")
            .locatedBy("//javaClass[@resource-id='com.booking:id/bstage1_contact_telephone_value']/android.widget.EditText");
    public static final Target RADIO_BTN_LEISURE = Target.the("Radio button leisure")
            .locatedBy("//android.widget.RadioButton[@resource-id='com.booking:id/business_purpose_leisure']");
    public static final Target TOTAL_PRICE = Target.the("Precio final")
            .locatedBy("//android.widget.TextView[@resource-id='com.booking:id/title']");
    public static final Target BUTTON_NEXT_STEP = Target.the("button siguiente")
            .locatedBy("//android.widget.Button[@resource-id='com.booking:id/action_button']");

}
