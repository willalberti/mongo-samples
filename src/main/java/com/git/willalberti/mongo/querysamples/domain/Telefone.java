package com.git.willalberti.mongo.querysamples.domain;

import lombok.Data;

@Data
public class Telefone {

    private String Id;
    private String numeroLinha;
    private String nomeContato;
    private Tipos tipo;
}

