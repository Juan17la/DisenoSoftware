public class EmpleadoPorHoras extends Empleado{
    
    int horasTrabajadas;
    Double tarifaHora;

    public EmpleadoPorHoras(String name, Double salarioBase, String departamento, int horasTrabajadas,
            Double tarifaHora) {
        super(name, salarioBase, departamento);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    Double CalcularSalarioTotal() {
        super.salarioBase = horasTrabajadas * tarifaHora;
        return super.salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(Double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoPorHoras [horasTrabajadas=" + horasTrabajadas + ", tarifaHora=" + tarifaHora + "]";
    }    

}
