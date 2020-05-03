package ch.bawey.wordbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bawey.wordbook.entities.PhraseMeaning;

public interface PhraseMeaningsRepository extends JpaRepository<PhraseMeaning, Integer> {
    
}