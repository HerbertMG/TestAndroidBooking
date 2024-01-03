package userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class HomePageBooking {

    public static final Target DESTINATION_BOX = Target.the("Activar input para la ciudad o destino")
            .located(AppiumBy.id("facet_search_box_basic_field_label"));

    public static final Target DESTINATION_BOX_INPUT = Target.the("Input para la ciudad o destino")
            .located(AppiumBy.id("facet_with_bui_free_search_booking_header_toolbar_content"));

    public static final Target DESTINATION_FINAL = Target.the("La ciudad o destino")
            .locatedBy("(//android.widget.TextView[@text='Cusco'])[1]");

    public static final Target CALENDAR_LIST = Target.the("Calendario contenedor de fechas")
            .located(AppiumBy.id("com.booking:id/calendar_month_list"));

    public static final Target CHECK_IN = Target.the("Fecha de inicio")
            .locatedBy("//android.view.View[@content-desc='{0}']");

    public static final Target CHECK_OUT = Target.the("Fecha de fin")
            .locatedBy("//android.view.View[@content-desc='{0}']");

    public static final Target BUTTON_DATE_CONFIRMATION = Target.the("Button para confirmar fechas seleccionadas")
            .located(AppiumBy.id("facet_date_picker_confirm"));

    public static final Target OCCUPANCY_BOX = Target.the("Activar input para los ocupantes")
            .located(AppiumBy.id("facet_search_box_accommodation_occupancy"));

    public static final Target BUTTON_ADD_CHILD = Target.the("Button para agregar niños")
            .locatedBy("(//android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button'])[3]");

    public static final Target BUTTON_AGE = Target.the("Button de la edad del niño")
            .locatedBy("(//android.widget.Button[@text='{0} years old'])");

    public static final Target BUTTON_AGE_OK = Target.the("Button para confirmar edad")
            .located(AppiumBy.id("android:id/button1"));

    public static final Target BUTTON_APPLY = Target.the("Button para aplicar cambios")
            .located(AppiumBy.id("group_config_apply_button"));

    public static final Target BUTTON_SEACRH = Target.the("Button para realizar busqueda")
            .located(AppiumBy.id("facet_search_box_cta"));

    public static final Target ALERT_ERROR = Target.the("Mensaje de error")
            .located(AppiumBy.id("com.booking:id/message"));


}
