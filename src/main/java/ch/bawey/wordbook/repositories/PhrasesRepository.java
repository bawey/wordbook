package ch.bawey.wordbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bawey.wordbook.entities.Phrase;

public interface PhrasesRepository extends JpaRepository<Phrase, Integer>{
    
}