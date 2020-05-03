package ch.bawey.wordbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.Definition;
import ch.bawey.wordbook.repositories.DefinitionsRepository;



@RestController
@RequestMapping("/definitions")
public class DefinitionsController {
    
    @Autowired
    DefinitionsRepository repo;
    
    @GetMapping
    public Iterable<Definition> find() {
        return repo.findAll();
    }

    @PostMapping
    public Definition postMethodName(@RequestBody Definition entity) {
        return repo.save(entity);
    }
    
    
}