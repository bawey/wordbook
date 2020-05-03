package ch.bawey.wordbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.PhraseMeaning;
import ch.bawey.wordbook.repositories.PhraseMeaningsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/phraseMeanings")
public class PhraseMeaningsController {
    
    @Autowired
    private PhraseMeaningsRepository repo;

    @GetMapping
    public Iterable<PhraseMeaning> find(){
        return repo.findAll();
    }

    @PostMapping
    public PhraseMeaning insert(@RequestBody PhraseMeaning entity) {
        return repo.save(entity);
    }
    
}