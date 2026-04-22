package entities.tipos;

public class Calificaciones implements TipoNotificacion{

    @Override
    public String construirMensaje() {
        System.out.println("=======================================");
        System.out.println("Creando Mensaje de Calificaciones, pipu pipu");
        System.out.println("=======================================");
        String mensaje = "soy el mensaje de calificaciones p";
        return mensaje;
    }
    
}
