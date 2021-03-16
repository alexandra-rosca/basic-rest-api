package com.example.demo.controller.service;

import com.example.demo.converter.PersonConverter;
import com.example.demo.dto.PersonDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonConverter personConverter;

    public void savePerson(PersonDto personDto) {
        Person person = personConverter.dtoToEntity(personDto);
        personRepository.save(person);
    }
}
