public class Libro {
    // Atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private String imagen;

    public Libro(String ISBN, String titulo, String autor, String imagen) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.imagen = imagen;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}