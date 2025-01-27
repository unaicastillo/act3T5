public class GestionDeLibros {

    public static void main(String[] args) throws Exception {
    
    
        Libros Cantar = new Libros("Cantar del Mio Cid", "Desconocido", "Acción", false); 
        Libros ES = new Libros("El Silmarillion", "J.R.R.Tolkien", "Fantasía", false); 
        Libros Cap = new Libros("El capital", "Karl Marx", "Abrir mente", false); 
        Libros LR = new Libros("El libro rojo", "Mao Zedong", "Abrir mente", false); 
        Libros SANE = new Libros("Socialismo a nuestro estilo", "Kim il Sung", "Abrir mente", false); 


        Libros B5 = new Libros("Maximum Berserk 1-5", "三浦建太郎", "Acción", false); 


        Libros[] Alm = new Libros[100];
        Libros[] librosAElegir = new Libros[6];

        /*Esto almacena al iniciar los libros que hay por defecto */


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




}