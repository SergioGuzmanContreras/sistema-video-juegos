package mx.com.ersoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Erik Sergio Guzman Contreras 
 * @created 10 feb. 2020
**/

@Controller
public class ListadoCotroller {

    @RequestMapping("/")
    public String getVIdeoJuegos(){        
        return "listado";
    }
}