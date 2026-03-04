package io.github.fatec.introducao.controller;

import io.github.fatec.introducao.dto.request.PessoaPostRequest;
import io.github.fatec.introducao.dto.request.PessoaPutRequest;
import io.github.fatec.introducao.dto.response.PessoaResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @PostMapping
    public PessoaResponse criarPessoa(@RequestBody PessoaPostRequest request) {
        Long idGerado = 1L;
        return new PessoaResponse(idGerado, request.nome());
    }

    @PutMapping
    public PessoaResponse atualizarPessoa(@RequestBody PessoaPutRequest request) {
        return new PessoaResponse(request.id(), request.nome());
    }

    @DeleteMapping("/{id}")
    public String deletarPessoa(@PathVariable Long id) {
        return "Usuario: " + id + " Deletado";
    }

}
