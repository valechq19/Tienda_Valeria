
package com.tienda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    //Repeticiones HTTP (Get: Recuperar datos)
    @GetMapping("/") 
     public String inicio(Model model){
            var mensaje="Estamos en la semana4,saludos";
            log.info("Ahora se usa arquitectura MVC");
            model.addAttribute("mensaje",mensaje);
            return"index";
}
}
