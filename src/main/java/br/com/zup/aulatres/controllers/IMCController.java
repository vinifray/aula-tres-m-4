package br.com.zup.aulatres.controllers;

import br.com.zup.aulatres.models.IMC;
import br.com.zup.aulatres.services.IMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("IMC/")
public class IMCController {

    @Autowired
    private IMCService imcService;

    @PutMapping
    public double calcularIMC(@RequestBody IMC imc){
        return imcService.calcularIMC(imc);
    }
}
