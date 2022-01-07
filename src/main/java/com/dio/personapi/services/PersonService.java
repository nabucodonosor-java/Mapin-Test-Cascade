package com.dio.personapi.services;

import com.dio.personapi.dto.PersonDto;
import com.dio.personapi.dto.PhoneDto;
import com.dio.personapi.model.Person;
import com.dio.personapi.model.Phone;
import com.dio.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    // @Transactional
    public PersonDto insert(PersonDto dto) {
        Person entity = new Person();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setCpf(dto.getCpf());
        entity.setBirthDate(dto.getBirthDate());
        entity.getPhones().clear();
        dto.getPhones().forEach(phone -> entity.getPhones().add(new Phone(phone)));
        repository.save(entity);
        return new PersonDto(entity);
    }
    /*
    private void copyToEntity(PersonDto dto, Person entity) {
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setCpf(dto.getCpf());
        entity.setBirthDate(dto.getBirthDate());
    }
    */
}
