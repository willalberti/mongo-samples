package com.git.willalberti.mongo.querysamples.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.git.willalberti.mongo.querysamples.domain.Cliente;

public interface ClienteMongo extends MongoRepository<Cliente, String> {

    
    List<Cliente> findByCpfAndNome(String CPF, String name);

    @Query("{ 'cpf' : ?0, 'nome' : ?1 }")
    List<Cliente> findByCpfAndNomeQuery(String cpf, String nome);
}