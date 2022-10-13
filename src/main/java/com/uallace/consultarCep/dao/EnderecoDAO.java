package com.uallace.consultarCep.dao;


import org.springframework.data.repository.CrudRepository;
import com.uallace.consultarCep.model.Endereco;

public interface EnderecoDAO extends CrudRepository<Endereco, Integer>{
}
