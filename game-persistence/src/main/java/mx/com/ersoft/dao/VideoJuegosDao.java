package mx.com.ersoft.dao;

import mx.com.ersoft.model.VideoJuegosModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Erik Sergio Guzman Contreras 
 * @created 11 feb. 2020
**/

public interface VideoJuegosDao extends JpaRepository<VideoJuegosModel, Integer>{
    
}
