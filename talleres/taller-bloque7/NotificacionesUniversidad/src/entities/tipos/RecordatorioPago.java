package entities.tipos;

public class RecordatorioPago implements TipoNotificacion{

    @Override
    public String construirMensaje() {
        System.out.println("=======================================");        
        System.out.println("Creando Mensaje de Recordatorio Pago, pipu pipu");
        System.out.println("=======================================");
        String mensaje = "soy el mensaje de Recordatorio pago p, me debes 10k causa";
        return mensaje;
    }
    
}
