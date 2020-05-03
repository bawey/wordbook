package ch.bawey.wordbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.WordMeaning;
import ch.bawey.wordbook.repositories.WordMeaningsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/wordMeanings")
public class WordMeaningsController {

    @Autowired
    private WordMeaningsRepository repo;

    @GetMapping
    public Iterable<WordMeaning> find(){
        return repo.findAll();
    }

    @PostMapping
    public WordMeaning insert(@RequestBody WordMeaning entity) {
        return repo.save(entity);
    }
    
}