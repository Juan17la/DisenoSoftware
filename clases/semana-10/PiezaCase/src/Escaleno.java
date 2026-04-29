public class Escaleno extends TrianguloBase {

    public Escaleno() {
    }

    public Escaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    double perimetro() {
        return (super.getLadoA() + super.getLadoB() + super.getLadoC());
    }

    @Override
    public String toString() {
        return "Escaleno [" + super.toString() + "]";
    }
}
