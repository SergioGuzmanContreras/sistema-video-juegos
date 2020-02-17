package mx.com.ersoft.controller;

import java.util.List;
import mx.com.ersoft.model.VideoJuegosModel;
import mx.com.ersoft.service.VideoJuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Erik Sergio Guzman Contreras 
 * @created 10 feb. 2020
**/

@Controller
public class ListadoCotroller {
    
    @Autowired
    private VideoJuegosService videoJuegosService;

    @RequestMapping("/")
    public String getVIdeoJuegos(Model model){
        List<VideoJuegosModel> lstDestacados = videoJuegosService.getAll();
        model.addAttribute("videojuegos", lstDestacados);
        return "listado";
    }
    
    @RequestMapping("/distribuidor")
    public String getDistribuidor(int id, Model model){
        List<VideoJuegosModel> lstVideoJuegos = videoJuegosService.getForDistribuitor(id);
        model.addAttribute("videojuegos", lstVideoJuegos);
        return "listado";
    }
    
    @RequestMapping("/buscar")
    public String getForName(@RequestParam("buscar") String buscar, Model model){
        List<VideoJuegosModel> lstVideoJuegos = videoJuegosService.findByNombreContaining(buscar);
        model.addAttribute("videojuegos", lstVideoJuegos);
        return "listado";
    }
}