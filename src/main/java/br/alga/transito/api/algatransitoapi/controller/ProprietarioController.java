package br.alga.transito.api.algatransitoapi.controller;

import br.alga.transito.api.algatransitoapi.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    private final EntityManager manager;

    public ProprietarioController(EntityManager manager) {
        this.manager = manager;
    }

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        return manager.createQuery("from Proprietario", Proprietario.class)
                .getResultList();
    }
}
