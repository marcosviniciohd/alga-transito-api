package br.alga.transito.api.algatransitoapi.controller;

import br.alga.transito.api.algatransitoapi.domain.model.Proprietario;
import br.alga.transito.api.algatransitoapi.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
public class ProprietarioController {

    private final ProprietarioRepository proprietarioRepository;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {

        // Consulta com like
        //return proprietarioRepository.findByNomeContaining("a");

        // Consulta exata
        //return proprietarioRepository.findByNome("João Desce A Serra");

        // Listar todos os proprietários
        return proprietarioRepository.findAll();
    }
}
