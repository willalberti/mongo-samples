package com.git.willalberti.mongo.querysamples.domain;

import lombok.Data;

@Data
public class Endereco {
    private String Id;
    
    private String Nome;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String Cidade;
    private String estado;
    
}
