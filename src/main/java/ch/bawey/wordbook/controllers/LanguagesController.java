package ch.bawey.wordbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.Language;
import ch.bawey.wordbook.repositories.LanguagesRepository;

@RestController
@RequestMapping(path = "/languages")
public class LanguagesController {
    @Autowired
    private LanguagesRepository repo;

    @GetMapping("")
    public Iterable<Language> listAll(){
        return repo.findAll();
    }

    @PostMapping(value="")
    public Language postMethodName(@RequestBody Language newLanguage) {
        return this.repo.save(newLanguage);
    }
    
}