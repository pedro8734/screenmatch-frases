package com.aluracursos.screenmatch_frases.service;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServicio {
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase =  repositorio.obtenerFraseAleatoria();
        return new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(),frase.getPersonaje(), frase.getPoster());
    }


}
