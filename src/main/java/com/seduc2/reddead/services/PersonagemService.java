package com.seduc2.reddead.services;

import com.seduc2.reddead.entities.Personagem;
import com.seduc2.reddead.repositories.PersonagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    private final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }

    public Personagem salvar(Personagem personagem){
        return repository.save(personagem);
    }

    public List<Personagem> listar(){
        return repository.findAll();
    }

}
