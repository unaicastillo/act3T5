import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GestionUsuarios gestor=new GestionUsuarios();
        gestor.addUser(new Persona("unai", "1234", false));
        gestor.addUser(new Persona("dario", "5678", false));
        gestor.addUser(new Persona("abel", "9012", true));
        gestor.addUser(new Persona("pablo", "3456", false));
        gestor.addUser(new Persona("enrique", "7890", false));
        gestor.addUser(new Persona("alex", "1234", true));
        gestor.addUser(new Persona("emilio", "5678", true));
        gestor.addUser(new Persona("alberto", "9012", false));
        System.out.println("Escribe tu nombre");
        gestor.buscarUser();
        
    }

}
