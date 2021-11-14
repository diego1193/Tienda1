package com.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Clientes;

public interface ClientesRepository extends MongoRepository<Clientes, Integer>{

}
