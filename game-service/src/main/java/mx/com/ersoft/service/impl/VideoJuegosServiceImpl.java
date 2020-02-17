package mx.com.ersoft.service.impl;

import java.util.List;
import mx.com.ersoft.dao.VideoJuegosDao;
import mx.com.ersoft.model.VideoJuegosModel;
import mx.com.ersoft.service.VideoJuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Erik Sergio Guzman Contreras
 * @created Feb 11, 2020
**/

@Service
public class VideoJuegosServiceImpl implements VideoJuegosService{

    @Autowired
    private VideoJuegosDao videoJuegosDao;
    
    @Override
    public List<VideoJuegosModel> getDestacados() {
        return videoJuegosDao.findAll();
    }

    @Override
    public List<VideoJuegosModel> getAll() {
        return videoJuegosDao.getAll();
    }

    @Override
    public List<VideoJuegosModel> getForDistribuitor(int id) {
        return videoJuegosDao.getForDistribuitor(id);
    }

    @Override
    public List<VideoJuegosModel> findByNombreContaining(String buscar) {
        return videoJuegosDao.findByNombreContaining(buscar);
    }

}
