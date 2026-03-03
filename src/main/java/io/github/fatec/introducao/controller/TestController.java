package io.github.fatec.introducao.controller;

import io.github.fatec.introducao.dto.Records;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class TestController {

    @PostMapping
    public Records.PessoaResponse criarPessoa(@RequestBody Records.PessoaPostRequest request) {
        Long idGerado = 1L;
        return new Records.PessoaResponse(idGerado, request.nome());
    }

    @PutMapping
    public Records.PessoaResponse atualizarPessoa(@RequestBody Records.PessoaPutRequest request) {
        return new Records.PessoaResponse(request.id(), request.nome());
    }

    @DeleteMapping("/{id}")
    public String deletarPessoa(@PathVariable Long id) {
        return "Usuario: " + id + " Deletado";
    }

}
