package services;

import java.time.LocalDate;
import java.util.List;

import entities.EstadoNotificacion;
import entities.Notificacion;
import entities.canales.CanalNotificacion;
import entities.tipos.TipoNotificacion;

public class NotificacionService {
    public void enviar(TipoNotificacion tipo, List<CanalNotificacion> canales, String destinatario, long codigo) {
        Notificacion n = new Notificacion();
        n.setMensaje(tipo.construirMensaje());
        n.setDestinatario(destinatario);
        n.setCodigo(codigo);
        n.setFechaEnvio(LocalDate.now());
        n.setEstado(EstadoNotificacion.ENVIADO);

        for (CanalNotificacion canal : canales) {
            canal.enviar(n);
        }
    }
}