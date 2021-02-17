package com.charactergenerator.server.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.charactergenerator.server.controller.ResourceNotFoundException;
import com.charactergenerator.server.model.Character;
import com.charactergenerator.server.repository.CharacterRepository;

@Service
@Transactional
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character updateCharacter(Character character) {
        Optional<Character> char1 = this.characterRepository.findById((character.getId()));

        if (char1.isPresent()) {
            Character charUpdate = char1.get();
            charUpdate.setId(character.getId());
            charUpdate.setName(character.getName());
            charUpdate.setBodyLink(character.getBodyLink());
            charUpdate.setComplexionLink(character.getComplexionLink());
            charUpdate.setNoseLink(character.getNoseLink());
            charUpdate.setEyeShapeLink(character.getEyeShapeLink());
            charUpdate.setEyeTypeLink(character.getEyeTypeLink());
            charUpdate.setEyebrowsLink(character.getEyebrowsLink());
            charUpdate.setMouthLink(character.getMouthLink());
            charUpdate.setFaceBlemishLink(character.getFaceBlemishLink());
            charUpdate.setHairLink(character.getHairLink());
            characterRepository.save(charUpdate);
            return charUpdate;
        } else {
            throw new ResourceNotFoundException("Character id not found : " + character.getId());
        }
    }

    @Override
    public Character getCharacterById(long characterId) {

        Optional<Character> char1 = this.characterRepository.findById(characterId);

        if (char1.isPresent()) {
            return char1.get();
        } else {
            throw new ResourceNotFoundException("Character id not found : " + characterId);
        }
    }

    @Override
    public void deleteCharacter(long characterId) {

        Optional<Character> char1 = this.characterRepository.findById(characterId);

        if (char1.isPresent()) {
            this.characterRepository.delete(char1.get());
        } else {
            throw new ResourceNotFoundException("Character id not found : " + characterId);
        }
    }
}
