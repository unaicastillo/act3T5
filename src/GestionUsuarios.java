import java.util.Scanner;

public class GestionUsuarios {
   public static Scanner sc = new Scanner(System.in);
   private Persona persona = new Persona();

   private Persona[] registro;
   private int lleno;
   private static int tam = 100;

   public GestionUsuarios() {
      registro = new Persona[tam];
      lleno = 0;
   }

   public void addUser(Persona p) {
      if (lleno < tam) {
         registro[lleno] = p;
         lleno++;
      }
   }

   public void buscarUser() {
      String contrasena;
      String nombre;
      boolean isUser = false;

      while (isUser == false) {

         nombre = sc.nextLine();

         if (nombre.equals(persona.getNombre())) {
            System.out.println("Escribe tu contraseña");
            contrasena = sc.nextLine();
            if (contrasena.equals(persona.getContrasena())) {
               contrasena = sc.nextLine();

            } else {
               System.out.println("esa contraseña es incorrecta");
            }
         } else {
            System.out.println("ese usuario no existe pruebe otra vez");
         }
      }

   }

   public void mostrarUser() {
      for (int i = 0; i < tam; i++) {
         System.out.println(registro[i].toString());
      }
   }

}