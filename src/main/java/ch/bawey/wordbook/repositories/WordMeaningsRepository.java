package ch.bawey.wordbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bawey.wordbook.entities.WordMeaning;

public interface WordMeaningsRepository extends JpaRepository<WordMeaning, Integer> {
    
}