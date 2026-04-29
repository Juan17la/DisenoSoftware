public class Acutangulo extends TrianguloBase {

    public Acutangulo() {
    }

    public Acutangulo(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    double perimetro() {
        return (super.getLadoA() + super.getLadoB() + super.getLadoC());
    }

    @Override
    public String toString() {
        return "Acutangulo [" + super.toString() + "]";
    }
        
}
