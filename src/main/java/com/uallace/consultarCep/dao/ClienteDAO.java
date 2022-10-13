package com.uallace.consultarCep.dao;

import org.springframework.data.repository.CrudRepository;
import com.uallace.consultarCep.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
    
}
