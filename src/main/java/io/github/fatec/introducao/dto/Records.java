package io.github.fatec.introducao.dto;

public class Records {
    public record PessoaPostRequest(String nome, String telefone, String endereco) {
    }

    public record PessoaPutRequest(Long id, String nome, String telefone, String endereco) {
    }

    public record PessoaResponse(Long id, String nome) {
    }
}
