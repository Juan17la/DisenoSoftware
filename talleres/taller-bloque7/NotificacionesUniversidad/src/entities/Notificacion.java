package entities;
import java.time.LocalDate;

public class Notificacion {

    Long codigo;
    String destinatario;
    String mensaje;
    LocalDate fechaEnvio;
    EstadoNotificacion estado;

    public Notificacion() {
    }

    public Notificacion(Long codigo, String destinatario, String mensaje, LocalDate fechaEnvio,
            EstadoNotificacion estado) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public EstadoNotificacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoNotificacion estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Notificacion [codigo=" + codigo + ", destinatario=" + destinatario + ", mensaje=" + mensaje
                + ", fechaEnvio=" + fechaEnvio + ", estado=" + estado + "]";
    }

}
