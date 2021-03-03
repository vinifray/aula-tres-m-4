package br.com.zup.aulatres.services;

import br.com.zup.aulatres.models.Soma;
import org.springframework.stereotype.Service;

@Service
public class MatematicaService {

    public int soma(Soma soma){
        int resultado = 0;
        for (int numero : soma.getNumeros()){
            resultado += numero;
        }
        return resultado;
    }
}
