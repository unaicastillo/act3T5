import java.util.Scanner;

public class GestionUsuarios {
   public static Scanner sc = new Scanner(System.in);
   private Persona persona = new Persona();

   private Persona[] registro;
   private int posicion;
   private int tam;

   public GestionUsuarios() {
      this.registro = new Persona[tam];
      this.posicion = 0;
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

            }
         } else {
            System.out.println("ese usuario no existe pruebe otra vez");
         }
      }

   }

   public void registrarUsuarios(Persona usuariPersona, Persona usuarioActivo) {
      if (usuariPersona != null) {
         registro[posicion] = usuariPersona;
         posicion++;
      }
   }

   public void mostrarUser(Persona usuarioActivo) {
      for (int i = 0; i < posicion; i++) {
         System.out.println(registro[i]);
      }

   }

}