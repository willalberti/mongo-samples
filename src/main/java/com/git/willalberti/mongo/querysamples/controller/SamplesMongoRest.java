package com.git.willalberti.mongo.querysamples.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.git.willalberti.mongo.querysamples.domain.Cliente;
import com.git.willalberti.mongo.querysamples.repository.ClienteMongo;

@RestController
@RequestMapping(value = "/api")
public class SamplesMongoRest {
    
    @Autowired
    private ClienteMongo clienteRepository;


    @GetMapping
    public List<Cliente> find() {

        return clienteRepository.findAll();


    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {


        cliente.setId(UUID.randomUUID().toString());
        var cliente2=clienteRepository.save(cliente);

        
        return new ResponseEntity<Cliente>(cliente2, HttpStatus.CREATED);
    }

    @GetMapping("/findByCpfAndNome")
    public List<Cliente> findByCpfAndNome(@RequestParam(name = "cpf", required = true) String cpf,
                                          @RequestParam(name = "nome", required = true) String nome) {

        return clienteRepository.findByCpfAndNome(cpf,nome);


    }

    @GetMapping("/findByCpfAndNomeQuery")
    public List<Cliente> findByCpfAndNomeQuery(@RequestParam(name = "cpf", required = true) String cpf,
                                               @RequestParam(name = "nome", required = true) String nome) {

        return clienteRepository.findByCpfAndNomeQuery(cpf,nome);


    }


}
