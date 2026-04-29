public abstract class Empleado{
    
    String name; 
    protected Double salarioBase;
    String departamento;

    public Empleado() {
    }
    
    public Empleado(String name, Double salarioBase, String departamento) {
        this.name = name;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    abstract Double CalcularSalarioTotal();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado [name=" + name + ", salarioBase=" + salarioBase + ", departamento=" + departamento + "]";
    }

}