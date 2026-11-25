package com.seduc2.reddead.controllers;

import com.seduc2.reddead.entities.Personagem;
import com.seduc2.reddead.services.PersonagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonagemController {

    private final PersonagemService service;
    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @PostMapping
    public String save(@RequestBody Personagem p){
        return service.salvar(p) + "Personagem Criado com sucesso!";
    }

    @GetMapping
    public List<Personagem> listar(){
        return service.listar();
    }

}
