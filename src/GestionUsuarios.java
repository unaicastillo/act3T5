public class GestionUsuarios{
   private Persona usuario;
   private Persona[] registro=new Persona[100];
   public GestionUsuarios(){
      usuario.setNombre("nombre");
      usuario.setContrasena("conn");
      usuario.setAdmin(false);
   }

   public void registrarUsuarios(){
      for (int i = 0; i < registro.length; i++) {
         registro[i]= usuario;
      }
   }
   public void mostrarUser(){
      for (int i = 0; i < registro.length; i++) {
         System.err.println(registro[i]);
      }
      
   }

}