import java.util.Scanner;

public class Biblioteca {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GestionUsuarios gestor=new GestionUsuarios();
        Persona user1 = new Persona("unai", "1234", false);
        Persona user2 = new Persona("dario", "5678", false);
        Persona user3 = new Persona("no", "9012", false);
        Persona admin1 = new Persona("babuku", "3456", true);
        Persona admin2 = new Persona("pablo", "7890", true);
        System.out.println("Escribe tu nombre");
            

        gestor.buscarUser();
        
    }

}
