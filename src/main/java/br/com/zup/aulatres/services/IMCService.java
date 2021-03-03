package br.com.zup.aulatres.services;

import br.com.zup.aulatres.models.IMC;
import org.springframework.stereotype.Service;

@Service
public class IMCService {

    public double calcularIMC(IMC imc){
        double resultaIMC = imc.getPeso() / (imc.getAltura()*2);
        return resultaIMC;
    }
}
