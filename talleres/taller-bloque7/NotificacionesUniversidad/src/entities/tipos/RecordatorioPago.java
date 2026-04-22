package entities.tipos;

public class RecordatorioPago implements TipoNotificacion{

    @Override
    public String construirMensaje() {
        System.out.println("Creando Mensaje de Recordatorio Pago, pipu pipu");
        String mensaje = "soy el mensaje de Recordatorio pago p, me debes 10k causa";
        return mensaje;
    }
    
}
