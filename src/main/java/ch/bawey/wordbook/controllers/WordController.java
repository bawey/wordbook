package ch.bawey.wordbook.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.Word;
import ch.bawey.wordbook.repositories.WordsRepository;

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordsRepository repo;

    @GetMapping(value = "/{id}")
    public Optional<Word> getMethodName(@PathVariable(name = "id", required = true) Integer id) {
        return repo.findById(id);
    }
}