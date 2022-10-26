package com.uallace.consultarCep.service;

import java.util.ArrayList;

import com.uallace.consultarCep.model.Cliente;

public interface IClienteService {
    
    public ArrayList<Cliente> listarClientes();
    public Cliente criarCliente(Cliente cliente);
}
