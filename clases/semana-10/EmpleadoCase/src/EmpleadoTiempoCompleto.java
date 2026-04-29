public class EmpleadoTiempoCompleto extends Empleado{
    
    Double bonoFijo;

    public EmpleadoTiempoCompleto(String name, Double salarioBase, String departamento, Double bonoFijo) {
        super(name, salarioBase, departamento);
        this.bonoFijo = bonoFijo;
    }

    @Override
    Double CalcularSalarioTotal() {
        return this.salarioBase + (this.salarioBase + bonoFijo);
    }

    public Double getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(Double bonoFijo) {
        this.bonoFijo = bonoFijo;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoTiempoCompleto [bonoFijo=" + bonoFijo + "]";
    }

}
