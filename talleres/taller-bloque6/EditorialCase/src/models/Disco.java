package models;

public class Disco extends Publicacion{
    float duracionMinutos;

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Disco() {
    }

    public Disco(String titulo, double precio, float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco [duracionMinutos=" + duracionMinutos + "]";
    }

}
