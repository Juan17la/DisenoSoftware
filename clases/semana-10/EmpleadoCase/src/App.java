public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        EmpleadoTiempoCompleto t1 = new EmpleadoTiempoCompleto("jose", 150.0, "ingenieria", 20.0);
        
        EmpleadoPorHoras t2 = new EmpleadoPorHoras("jose", 150.0, "ingenieria", 12, 2000.0);

        System.out.println(t1.CalcularSalarioTotal());
        System.out.println(t2.CalcularSalarioTotal());

        System.out.println(t1);
        System.out.println(t2);
    }
}
