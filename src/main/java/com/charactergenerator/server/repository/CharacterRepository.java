package com.charactergenerator.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.charactergenerator.server.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
