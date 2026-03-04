package io.github.fatec.introducao.dto.request;

public record PessoaPutRequest(Long id, String nome, String telefone, String endereco) {
}
