import java.util.Scanner;
public class GestionDeLibros {
        public static Scanner sc = new Scanner(System.in);

        private Libros[] libros;
        private int lleno;
        private static final int tam =100;


            Libros Cantar = new Libros("Cantar del Mio Cid", "Desconocido", "Acción", true); 
            Libros ES = new Libros("El Silmarillion", "J.R.R.Tolkien", "Fantasía", true); 
            Libros CAP = new Libros("El capital", "Karl Marx", "Abrir mente", true); 
            Libros LR = new Libros("El libro rojo", "Mao Zedong", "Abrir mente", true); 
            Libros SANE = new Libros("Socialismo a nuestro estilo", "Kim il Sung", "Abrir mente", true); 


            Libros B5 = new Libros("Maximum Berserk 1-5", "三浦建太郎", "Acción", true); 







        public GestionDeLibros() {
            libros = new Libros[tam];
            libros[0]=Cantar;
            libros[1]=ES;
            libros[2]=CAP;
            libros[3]=LR;
            libros[4]=SANE;
            libros[5]=B5;
            lleno = 5;
        }
    


        /*Añadir un libro y un espacio extra */
        public void nuevoLibro(int num, boolean newposicion) {
            if(lleno<tam){

                if (num==1){
                    libros[lleno] = Cantar;
                }
                if (num==2){
                    libros[lleno] = ES;
                }
                if (num==3){
                    libros[lleno] = CAP;
                }
                if (num==4){
                    libros[lleno] = LR;
                }
                if (num==5){
                    libros[lleno] = SANE;
                }
                if (num==6){
                    libros[lleno] = B5;
                }


                if(newposicion==true){
                    lleno++;
                }
            }
            else{
                System.out.println("La librería está abarrotada, no se puede añadir un libro más");
            }
        }






        /*Pregunta que libro queremos añadir introduciendo por el escaner el número correspondiente a una serie de libros predeterminados  */
        private void anhadirLibro(){

            System.out.println("Introduce el número del libro que quieres añadir");
            System.out.println("_______________________________________");
            System.out.println("1. Cantar del mio Cid");
            System.out.println("2. El Silmarillion");
            System.out.println("3. El libro rojo");
            System.out.println("4. El capital");
            System.out.println("4. Socialismo a nuestro estilo");
            System.out.println("5. Maximum Berserk 1-5");
            System.out.println("________________________________________");

            int num = sc.nextInt();
            boolean newposicion=true;
            nuevoLibro(num, newposicion);
            


        }



        /*Muestra toda la información de todos los libros que hay  */
        public void buscarLibro() {

            System.out.println("Lista de libros. : ");

            for (int i = 0; i < libros.length; i++) {
                System.out.println(libros[i].toString());
            }

        }










        /*Aqui se mostrarán todos los libros que estan disponibles actualmente.
         * Una condición que si se cumple que disponible==true entonces muestra el título del libro junto a su posición correspondiente en la lista
         */
        public void librosDisponibles(String titulo, boolean disponible){

            System.out.println("Libros actualmente disponibles: ");
            System.out.println("POSICIÓN    TÍTULO      ");
            System.out.println("--------    -------------");
            for (int i = 0; i < libros.length; i++) {
                if(libros[i].getDisponible()==true){
                    System.out.println((i+1)+"º.        "+libros[i].getTitulo());
                }
            }
        }

        /*Aqui se borra un libro dandole los valores predeterminados */
        public Libros borrarLibros(String titulo){

            System.out.println("Introduce el título del libro que quieres eliminar");
            String borrar = sc.nextLine();
            for (int i = 0; i < libros.length; i++) {
                if (libros[i].getTitulo()==borrar){
                    libros[i].Libros(titulo);
                    
                }
            }
        }
/*Mover la posición a la que se le hadado valor cero a la derecha del todo, moviendo los valores que hay a la derecha una posición a la izquierda */








        /*Realizar préstamos de libros el cual implica =  ([1] usuario y [1 o +1] libro/s) */


        

        /*Realizar una devolución de préstamos, para que el libro/s vuelvan a estar disponibles */
            

        /*Lista de -> 1.Nº de prestados hitórico     2.Nº de prestados activos 
         *-Guardar el en ambos listados los datos del usuario y libro
        */

        /*Mostrar los 5 libros mas vendidos & Mostrar el usuario/s con más préstamos activos */










    

}
/*
    public static void main(String[] args) throws Exception {
    
    
        Libros Cantar = new Libros("Cantar del Mio Cid", "Desconocido", "Acción", true); 
        Libros ES = new Libros("El Silmarillion", "J.R.R.Tolkien", "Fantasía", true); 
        Libros Cap = new Libros("El capital", "Karl Marx", "Abrir mente", true); 
        Libros LR = new Libros("El libro rojo", "Mao Zedong", "Abrir mente", true); 
        Libros SANE = new Libros("Socialismo a nuestro estilo", "Kim il Sung", "Abrir mente", true); 


        Libros B5 = new Libros("Maximum Berserk 1-5", "三浦建太郎", "Acción", true); 


        Libros[] Alm = new Libros[100];
        Libros[] librosAElegir = new Libros[6];

        /Esto almacena al iniciar los libros que hay por defecto /


        librosAElegir[0]=Cantar;
        librosAElegir[1]=ES;
        librosAElegir[2]=Cap;
        librosAElegir[3]=LR;
        librosAElegir[4]=SANE;
        librosAElegir[5]=B5;

        for (int i = 0; i < librosAElegir.length; i++) {
            Alm[i]=librosAElegir[i];
        }

        
        


    }


*/









    /*
    private Libros[] coleccion = new Libros[1000];
    private boolean noHayCero=true;

    
    public GestionDeLibros(int tam, int[] coleccion, boolean noHayCero, int aux, Libros libro) {

        this.noHayCero = noHayCero;
    }

    private void agregarLibro(){


        
        int j=0;
        while(noHayCero==true&&j<coleccion.length){
            j++;
            if (coleccion[j]==null) {
                noHayCero=false;
                coleccion[j]=getLibro(); 
                
            }
        }
    }

    public 



    private void eliminarLibro(){
        
        
    }
*/
    /*
     * Agregar libros nuevos.(admin)
     * Eliminar libros existentes.(admin)
     * Buscar libros por título, autor o categoría.(todos)
     * Mostrar todos los libros disponibles.(todos)
     */

/*

    public boolean isNoHayCero() {
        return this.noHayCero;
    }

    public boolean getNoHayCero() {
        return this.noHayCero;
    }

    public void setNoHayCero(boolean noHayCero) {
        this.noHayCero = noHayCero;
    }


    public Libros getLibro() {
        return this.libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

*/




