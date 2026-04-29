public abstract class TrianguloBase {

    double ladoA;
    double ladoB;
    double ladoC;
    
    
    public TrianguloBase() {
    }
    
    public TrianguloBase(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    abstract double perimetro();
    
    public double CalcularAreaconHipotenusa(double lado, double hipotenusa){
        if (lado <= 0 & hipotenusa <= 0) {
            System.out.println("no se puede debe ser un numero mayor a 0");
        }
        return Math.sqrt(lado*2 + hipotenusa*2);
    };

    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        return "TrianguloBase [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
    }
}