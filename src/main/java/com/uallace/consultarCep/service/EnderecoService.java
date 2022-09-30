package com.uallace.consultarCep.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uallace.consultarCep.dao.EnderecoDAO;
import com.uallace.consultarCep.model.Endereco;


@Service
public class EnderecoService implements IEnderecoService{

    @Autowired
    private EnderecoDAO dao;

    @Override
    public ArrayList<Endereco> listarTodos() {
        // TODO Auto-generated method stub
        return (ArrayList<Endereco>)dao.findAll();
    }

    @Override
    public Endereco criar(Endereco endereco) {
        // TODO Auto-generated method stub
        if(endereco != null){
            return dao.save(endereco);
        }
        return null;
    }
    
}
