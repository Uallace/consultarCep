package com.uallace.consultarCep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uallace.consultarCep.model.Endereco;
import com.uallace.consultarCep.service.EnderecoService;

@Controller
public class IndexController {
    
    @Autowired
    EnderecoService service;

    @GetMapping("/")
    public String index()
    {
        return "endereco/index";
    }

    @PostMapping("/endereco/create")
    public String create(Endereco endereco){
        service.criar(endereco);
        return "redirect:/";
    }

}
