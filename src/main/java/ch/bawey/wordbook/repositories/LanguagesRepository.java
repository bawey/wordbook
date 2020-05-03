package ch.bawey.wordbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bawey.wordbook.entities.Language;

public interface LanguagesRepository extends JpaRepository<Language, Integer> {
    
}