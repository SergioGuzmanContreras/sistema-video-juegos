package mx.com.ersoft.dao;

import java.util.List;
import mx.com.ersoft.model.VideoJuegosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * @author Erik Sergio Guzman Contreras 
 * @created 11 feb. 2020
**/

public interface VideoJuegosDao extends JpaRepository<VideoJuegosModel, Integer>{
    
    @Query("FROM VideoJuegosModel v ORDER BY v.nombre")
    List<VideoJuegosModel> getAll();

    @Query("FROM VideoJuegosModel v WHERE v.distribuidor.id = ?1 ORDER BY v.nombre")
    List<VideoJuegosModel> getForDistribuitor(int id);

    List<VideoJuegosModel> findByNombreContaining(String buscar);

}
