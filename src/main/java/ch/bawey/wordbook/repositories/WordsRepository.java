package ch.bawey.wordbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bawey.wordbook.entities.Word;

public interface WordsRepository extends JpaRepository<Word, Integer> {
    
}