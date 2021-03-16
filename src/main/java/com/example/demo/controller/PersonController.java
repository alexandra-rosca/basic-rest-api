package com.example.demo.controller;

import com.example.demo.controller.service.PersonService;
import com.example.demo.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/person")
    ResponseEntity<PersonDto> all(@RequestBody PersonDto personDto) {
        personService.savePerson(personDto);
//        PersonDto personDto = new PersonDto();
//        personDto.setUsername("user");
//        personDto.setPassword("pass");

        return ResponseEntity.ok(personDto);
    }
}
