package mx.com.ersoft.model;


/**
 * @author Erik Sergio Guzman Contreras
 * @created Feb 11, 2020
**/

public class VideoJuegosModel {

    private String nombre;
    private String descripcion;
    private String imagen;

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getImagen() { return imagen; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    @Override
    public String toString() {
        return "VideoJuegosModel{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + '}';
    }
        
}
