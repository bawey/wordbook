package ch.bawey.wordbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.Phrase;
import ch.bawey.wordbook.repositories.PhrasesRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/phrases")
public class PhrasesController {

    @Autowired
    private PhrasesRepository repo;

    @GetMapping("")
    public Iterable<Phrase> find(){
        return repo.findAll();
    }

    @PostMapping
    public Phrase insert(@RequestBody Phrase entity) {
        return repo.save(entity);
    }
    
}