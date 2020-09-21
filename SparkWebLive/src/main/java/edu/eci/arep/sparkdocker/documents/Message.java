package edu.eci.arep.sparkdocker.documents;

import java.util.Calendar;
import java.util.Date;

public class Message {
    private String mensaje;
    private String fecha;

    public Message(String mensaje, String fecha) {
        if (mensaje.contains("<") || mensaje.contains(">") ){
            mensaje = mensaje.replace("<","").replace(">","");
        }
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return new Date().toString();
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
