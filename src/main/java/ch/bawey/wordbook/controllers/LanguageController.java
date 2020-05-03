package ch.bawey.wordbook.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.Language;
import ch.bawey.wordbook.repositories.LanguagesRepository;


@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguagesRepository repo;

    @GetMapping("/{id}")
    public Optional<Language> getOne(@PathVariable(name = "id") Integer id) {
        return repo.findById(id);
    }

}