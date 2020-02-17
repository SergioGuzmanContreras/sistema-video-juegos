package mx.com.ersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Erik Sergio Guzman Contreras
 * @created Feb 16, 2020
**/
@Entity
@Table(name = "desarrollador")
public class DesarrolladorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_desarrollador")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "web")
    private String web;

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getWeb() { return web; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setWeb(String web) { this.web = web; }

    @Override
    public String toString() {
        return "DesarrolladorModel{" + "id=" + id + ", nombre=" + nombre + ", web=" + web + '}';
    }    
    
}
