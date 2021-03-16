package com.example.demo.converter;

import com.example.demo.dto.PersonDto;
import com.example.demo.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonConverter {

    public PersonDto entityToDto(Person person) {
        PersonDto personDto = new PersonDto();

        personDto.setUsername(person.getUsername());
        personDto.setPassword(person.getPass());

        return personDto;
    }

    public Person dtoToEntity(PersonDto personDto) {
        Person person = new Person();

        person.setUsername(personDto.getUsername());
        person.setPass(personDto.getPassword());

        return person;
    }
}
