package com.charactergenerator.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.charactergenerator.server.model.Character;
import com.charactergenerator.server.service.CharacterService;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/characters/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable long id) {
        return ResponseEntity.ok().body(characterService.getCharacterById(id));
    }

    @PostMapping("/characters")
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        return ResponseEntity.ok().body(this.characterService.createCharacter(character));
    }

    @PutMapping("/characters/{id}")
    public ResponseEntity<Character> updateCharacter(@PathVariable long id, @RequestBody Character character) {
      character.setId(id);
      return ResponseEntity.ok().body(this.characterService.updateCharacter(character));
    }

    @DeleteMapping("/character/{id}")
    public HttpStatus deleteCharacter(@PathVariable long id) {
        this.characterService.deleteCharacter(id);
        return HttpStatus.OK;
    }
}
