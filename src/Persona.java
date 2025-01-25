import java.util.Scanner;

public class Persona {
    public static Scanner sc = new Scanner(System.in);

    private String nombre;
    private String contrasena;
    private boolean admin;

    public Persona() {
        this.nombre = "";
        this.contrasena = "1234";
        this.admin = true;
    }

    public Persona(String nombre, String contrasena, boolean admin) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.admin = admin;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

   

}