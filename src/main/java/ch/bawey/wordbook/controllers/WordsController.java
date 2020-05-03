package ch.bawey.wordbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bawey.wordbook.entities.Word;
import ch.bawey.wordbook.repositories.WordsRepository;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/words")
public class WordsController {

    @Autowired
    WordsRepository repo;

    @GetMapping("")        
    public Iterable<Word> find(){
        return repo.findAll();
    }

    @PostMapping(value="")
    public Word insert(@RequestBody Word newWord) {
        return repo.save(newWord);
    }
    
}