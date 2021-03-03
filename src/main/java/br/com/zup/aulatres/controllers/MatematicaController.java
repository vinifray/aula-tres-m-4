package br.com.zup.aulatres.controllers;

import br.com.zup.aulatres.models.Soma;
import br.com.zup.aulatres.services.MatematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("matematica/")
public class MatematicaController {

    @Autowired
    private MatematicaService matematicaService;

    @PutMapping("soma/")
    public int soma(@RequestBody Soma objetoSoma){
        return matematicaService.soma(objetoSoma);
    }
}
