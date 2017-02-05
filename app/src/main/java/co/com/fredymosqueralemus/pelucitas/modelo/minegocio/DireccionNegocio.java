package co.com.fredymosqueralemus.pelucitas.modelo.minegocio;

import java.io.Serializable;
import java.util.Date;

import co.com.fredymosqueralemus.pelucitas.direccion.Direccion;

/**
 * Created by Fredy Mosquera Lemus on 2/02/17.
 */
public class DireccionNegocio extends Direccion implements Serializable {

    private String nitIdentificacionNegocio;
    private Date fechaInsercion;
    private Date fechaModificacion;

    public String getNitIdentificacionNegocio() {
        return nitIdentificacionNegocio;
    }

    public void setNitIdentificacionNegocio(String nitIdentificacionNegocio) {
        this.nitIdentificacionNegocio = nitIdentificacionNegocio;
    }

    @Override
    public Date getFechaInsercion() {
        return fechaInsercion;
    }

    @Override
    public void setFechaInsercion(Date fechaInsercion) {
        this.fechaInsercion = fechaInsercion;
    }

    @Override
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
