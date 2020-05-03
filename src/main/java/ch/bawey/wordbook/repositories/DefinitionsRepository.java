package ch.bawey.wordbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bawey.wordbook.entities.Definition;

public interface DefinitionsRepository extends JpaRepository<Definition, Integer> {
    
}