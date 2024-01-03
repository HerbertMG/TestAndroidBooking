package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewPage {

    public static final Target FINAL_TOTAL_PRICE = Target.the("Precio final en el detalle")
            .locatedBy("//android.widget.TextView[@resource-id='com.booking:id/bp_price_summary_total_price_value']");

    public static final Target BUTTON_FINAL_STEP = Target.the("button final step")
            .locatedBy("//android.widget.Button[@resource-id='com.booking:id/action_button']");
}
