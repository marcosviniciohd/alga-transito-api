package br.alga.transito.api.algatransitoapi.controller;

import br.alga.transito.api.algatransitoapi.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("João da Silva");
        proprietario1.setEmail("joao.silva@gmail.com");
        proprietario1.setTelefone("47 99999-9999");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Maria da Silva");
        proprietario2.setEmail("maria.silva@gmail.com");
        proprietario2.setTelefone("77 99999-9999");

        return Arrays.asList(proprietario1, proprietario2);

    }
}
