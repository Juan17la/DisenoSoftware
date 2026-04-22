package services;

import java.util.List;

import entities.Notificacion;
import entities.canales.CanalNotificacion;
import entities.tipos.TipoNotificacion;

public class NotificacionService {
    public void enviar(TipoNotificacion tipo, List<CanalNotificacion> canales, String destinatario) {
        Notificacion n = new Notificacion();
        n.setMensaje(tipo.construirMensaje());
        n.setDestinatario(destinatario);

        for (CanalNotificacion canal : canales) {
            canal.enviar(n);
        }
    }
}