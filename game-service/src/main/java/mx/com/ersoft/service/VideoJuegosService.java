package mx.com.ersoft.service;

import java.util.List;
import mx.com.ersoft.model.VideoJuegosModel;


/**
 * @author Erik Sergio Guzman Contreras
 * @created Feb 11, 2020
**/

public interface VideoJuegosService {

    List<VideoJuegosModel> getDestacados();
}
