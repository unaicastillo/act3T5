public class Libro{
    private String titutlo;
    private String autor;
    private String categoria;
    private boolean disponible;


    public Libro(String titutlo, String autor, String categoria, boolean disponible) {
        this.titutlo = titutlo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
    }


    public String getTitutlo() {
        return this.titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
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

    @Override
    public String toString() {
        return "{" +
            " titutlo='" + getTitutlo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", disponible='" + isDisponible() + "'" +
            "}";
    }


}