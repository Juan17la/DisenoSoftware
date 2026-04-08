package models;

public class Libro extends Publicacion {
    int numeroPaginas;
    int aniPublicacion;

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAniPublicacion() {
        return aniPublicacion;
    }

    public void setAniPublicacion(int aniPublicacion) {
        this.aniPublicacion = aniPublicacion;
    }

    public Libro() {
    }

    public Libro( String titulo, double precio, int numeroPaginas, int aniPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.aniPublicacion = aniPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "[Libro [numeroPaginas=" + numeroPaginas + ", aniPublicacion=" + aniPublicacion + "]]";
    }

}
