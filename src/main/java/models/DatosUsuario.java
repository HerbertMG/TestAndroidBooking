package models;

public class DatosUsuario {
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String zipcode;
    private String ciudadUser;
    private String pais;
    private String telefono;

    // Constructor
    public DatosUsuario(String nombre, String apellido, String email, String direccion, String zipcode,
                   String ciudadUser, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.zipcode = zipcode;
        this.ciudadUser = ciudadUser;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return email;
    }

    public String getApellido() {
        return email;
    }


    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getZipCode() {
        return zipcode;
    }

    public String getCityUser() {
        return ciudadUser;
    }

    public String getPais() {
        return pais;
    }

    public String getTelefono() {
        return telefono;
    }
}