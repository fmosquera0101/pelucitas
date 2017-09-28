package co.com.fredymosqueralemus.pelucitas.modelo.agenda;

import java.io.Serializable;

/**
 * Created by fredymosqueralemus on 14/09/17.
 */

public class TurnosXCliente implements Serializable{
    private String nombreNegocio;
    private String nombreEmpleado;
    private String uidEmpleado;
    private String fechaTurno;
    private String horaTurno;
    private String direccionNegocio;
    private String telefonoNegocioEmpleado;
    private String snTurnoCancelado;
    private String snEjecutado;

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getUidEmpleado() {
        return uidEmpleado;
    }

    public void setUidEmpleado(String uidEmpleado) {
        this.uidEmpleado = uidEmpleado;
    }

    public String getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(String fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public String getTelefonoNegocioEmpleado() {
        return telefonoNegocioEmpleado;
    }

    public void setTelefonoNegocioEmpleado(String telefonoNegocioEmpleado) {
        this.telefonoNegocioEmpleado = telefonoNegocioEmpleado;
    }

    public String getSnTurnoCancelado() {
        return snTurnoCancelado;
    }

    public void setSnTurnoCancelado(String snTurnoCancelado) {
        this.snTurnoCancelado = snTurnoCancelado;
    }

    public String getSnEjecutado() {
        return snEjecutado;
    }

    public void setSnEjecutado(String snEjecutado) {
        this.snEjecutado = snEjecutado;
    }
}
