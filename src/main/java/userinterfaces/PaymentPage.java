package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {

    public static final Target INPUT_CREDIT_CARD = Target.the("Input tarjeta de credito")
            .locatedBy("//android.widget.EditText[@resource-id='com.booking:id/new_credit_card_number_edit']");
    public static final Target INPUT_EXPIRATION_DATE = Target.the("Input fecha de expiracion")
            .locatedBy("//android.widget.EditText[@resource-id='com.booking:id/new_credit_card_expiry_date_edit']");
    public static final Target BUTTON_BOOK_NOW = Target.the("Button final de reserva")
            .locatedBy("//android.widget.Button[@resource-id='com.booking:id/action_button']");
}
