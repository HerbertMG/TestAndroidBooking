package userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class RoomPage {

    public static final Target SEARCH_RESULT = Target.the("Primer resultado de la lista")
            .locatedBy("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");

    public static final Target PRICE_TEXT = Target.the("Lista de precios")
            .located(AppiumBy.id("price_view_price"));

    public static final Target SELECT_RESULT = Target.the("Resultado a seleccionar")
            .locatedBy("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[{0}]");

    public static final Target BUTTON_SELECT_ROOM = Target.the("Button para seleccionar habitacion")
            .located(AppiumBy.id("select_room_cta"));

    public static final Target SUB_TOTAL_PRICE_TEXT = Target.the("Precio subtotal")
            .located(AppiumBy.id("price_view_price"));

    public static final Target BUTTON_SELECT_ROOM_OPTION = Target.the("Button de seleccion de habitacion")
            .located(AppiumBy.id("com.booking:id/rooms_item_select_layout"));

    public static final Target BUTTON_RESERVE = Target.the("Button de reserva")
            .located(AppiumBy.id("com.booking:id/main_action"));



}
