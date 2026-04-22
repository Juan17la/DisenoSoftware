package entities.canales;

import entities.Notificacion;

public class PushCanal implements CanalNotificacion {

    @Override
    public void enviar(Notificacion notificacion) {
        System.out.println("=======================================");
        System.out.println("notificacion por email enviadaaa");
        System.out.println("=======================================");
        System.out.println(notificacion);
    }

}
