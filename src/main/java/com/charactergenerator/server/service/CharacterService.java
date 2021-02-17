package com.charactergenerator.server.service;

import com.charactergenerator.server.model.Character;

public interface CharacterService {

    Character createCharacter(Character character);

    Character updateCharacter(Character character);

    Character getCharacterById(long characterId);

    void deleteCharacter(long id);
}
