package br.alga.transito.api.algatransitoapi.controller;

import br.alga.transito.api.algatransitoapi.domain.model.Proprietario;
import br.alga.transito.api.algatransitoapi.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {

    private final ProprietarioRepository proprietarioRepository;


    public List<Proprietario> listar() {

        // Consulta com like
        //return proprietarioRepository.findByNomeContaining("a");

        // Consulta exata
        //return proprietarioRepository.findByNome("João Desce A Serra");

        // Listar todos os proprietários
        return proprietarioRepository.findAll();
    }

    @GetMapping("/{proprietarioId}")
    public ResponseEntity<Proprietario> buscar(@PathVariable Long proprietarioId) {
        return proprietarioRepository.findById(proprietarioId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
