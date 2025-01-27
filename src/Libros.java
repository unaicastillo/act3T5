import java.util.Scanner;

public class Libros {


    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;



    public Libros(){
        titulo="";
        autor="";
        categoria="";
        disponible=false;
    }

    public Libros(String titulo, String autor, String categoria, boolean disponible){

        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.disponible=disponible;
    }





    public void getLibro(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número correspondiente al libro que quieras agregar");
        System.out.println("_______________________________________");
        System.out.println("1. Cantar del mio Cid");
        System.out.println("2. El Silmarillion");
        System.out.println("3. El libro rojo");
        System.out.println("4. Socialismo a nuestro estilo");
        System.out.println("5. Maximum Berserk 1-5");
        System.out.println("________________________________________");
        int buscador=sc.nextInt(11);

        

        if (buscador==1){

        }
        if (buscador==2){

        }
        if (buscador==3){}
        if (buscador==4){}
        if (buscador==5){}
        if (buscador==6){}
    }











    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    




    /*
    private String autor;
    private String categoria;
    private String titulo;
    private boolean disponible;

    private todosLibros
    public Libros(){
        this.autor ="";
        this.categoria = "";
        this.titulo = "";
        this.disponible =true;
        
    }


    public Libros( String autor, String categoria, String titulo, boolean disponible) {
        this.autor = autor;
        this.categoria = categoria;
        this.titulo = titulo;
        this.disponible = disponible;
    }



    public Cantar()







    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    */
    
}
