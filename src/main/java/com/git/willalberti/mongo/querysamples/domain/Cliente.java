package com.git.willalberti.mongo.querysamples.domain;

import lombok.Data;

@Data
public class Cliente {
    private String Id;
    private String nome;
    private String cpf;
    private Telefone telefone;
    private Endereco endereco;
    
}
