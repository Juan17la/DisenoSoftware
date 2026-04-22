package entities.tipos;

public class CancelacionClase implements TipoNotificacion{

    @Override
    public String construirMensaje() {
        System.out.println("Creando Mensaje de Cancelacion Clase, pipu pipu");
        String mensaje = "soy el mensaje de que no hay clase yeeeey";
        return mensaje;
    }
    
}
