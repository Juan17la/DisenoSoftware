import java.util.List;

import entities.canales.CanalNotificacion;
import entities.canales.EmailCanal;
import entities.canales.PushCanal;
import entities.canales.SMSCanal;
import entities.tipos.Calificaciones;
import entities.tipos.RecordatorioPago;
import entities.tipos.TipoNotificacion;
import services.NotificacionService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, esta es mi solucion del problema de notificaciones de universidad yeeey ");

        TipoNotificacion tipo = new Calificaciones();
        TipoNotificacion tipo2 = new RecordatorioPago();

        List<CanalNotificacion> canales = List.of(
                new EmailCanal(),
                new SMSCanal(),
                new PushCanal()
        );

        NotificacionService service = new NotificacionService();

        service.enviar(tipo, canales, "juan@example.com");
        service.enviar(tipo2, canales, "juan@example.com");

    }
}
