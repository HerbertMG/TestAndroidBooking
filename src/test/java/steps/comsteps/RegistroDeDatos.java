package steps.comsteps;


import io.cucumber.java.DataTableType;
import models.DatosUsuario;

import java.util.Map;


public class RegistroDeDatos {

    @DataTableType
    public DatosUsuario convertirDatosUsuario(Map<String, String> row) {
        return new DatosUsuario(
                row.get("nombre"),
                row.get("apellido"),
                row.get("email"),
                row.get("direccion"),
                row.get("zipcode"),
                row.get("ciudadUser"),
                row.get("pais"),
                row.get("telefono")
        );
    }
}
