package mx.com.ersoft.service.impl;

import java.util.ArrayList;
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

}
