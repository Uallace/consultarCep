package com.uallace.consultarCep.service;

import java.util.ArrayList;

import com.uallace.consultarCep.model.Cliente;
import ch.qos.logback.core.net.server.Client;

public interface IClienteService {
    
    public ArrayList<Cliente> listarClientes();
    public Cliente criarCliente(Cliente cliente);
}
