package com.dio.personapi.services;

import com.dio.personapi.dto.PersonDto;
import com.dio.personapi.model.Person;
import com.dio.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    // @Transactional
    public Person insert(Person entity) {
       repository.save(entity);
        return entity;
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
