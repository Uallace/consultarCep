package com.uallace.consultarCep.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uallace.consultarCep.dao.ClienteDAO;
import com.uallace.consultarCep.model.Cliente;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteDAO dao;

    @Override
    public ArrayList<Cliente> listarClientes() {
        // TODO Auto-generated method stub
        return (ArrayList<Cliente>)dao.findAll();
    }

    @Override
    public Cliente criarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        if(cliente != null){
            dao.save(cliente);

        }
        return null;
    }
    
}
