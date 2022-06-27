
package com.tienda.controller;

import com.tienda.domain.Cliente;
import java.util.Arrays;
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
            log.info("Ahora se usa arquitectura MVC");
            Cliente cliente1 = new Cliente("Pedro","Gomez Contreras","pgomez@gmail.com","85789847");
            Cliente cliente2=new Cliente("Rebeca","Arguedas Alfaro","raguedas@gmail.com","87889647");
            var clientes = Arrays.asList(cliente1,cliente2);
            model.addAttribute("clientes",clientes);
            return"index";
}
}
