package com.spring.mongo.api.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.*;

public interface UsuariosRepository extends MongoRepository<Usuarios, Integer> {

}
