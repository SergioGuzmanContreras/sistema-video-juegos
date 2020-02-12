package mx.com.ersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Erik Sergio Guzman Contreras
 * @created Feb 11, 2020
**/

@Entity
@Table(name = "videoJuegos")
public class VideoJuegosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_video_juego")
    private int id;
    private String nombre;
    private String descripcion;
    private String imagen;
    
    @ManyToOne
    private DistribuidorModel distribuidor;
    
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getImagen() { return imagen; }

    public DistribuidorModel getDistribuidor() {
        return distribuidor;
    }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public void setDistribuidor(DistribuidorModel distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public String toString() {
        return "VideoJuegosModel{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", distribuidor=" + distribuidor + '}';
    }
           
}
