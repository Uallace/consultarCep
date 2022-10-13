package com.uallace.consultarCep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uallace.consultarCep.model.Cliente;
import com.uallace.consultarCep.model.Endereco;
import com.uallace.consultarCep.service.ClienteService;

@Controller
public class IndexController {
    
    @Autowired
    ClienteService cliService;

    @GetMapping("/")
    public String index()
    {
        return "endereco/index";
    }

    @PostMapping("/endereco/create")
    public String create(Cliente cliente, Endereco endereco){
        cliente.setEndereco(endereco);
        cliService.criarCliente(cliente);
        return "redirect:/";
    }

}
