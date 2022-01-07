package com.dio.personapi.dto;

import com.dio.personapi.model.Person;
import com.dio.personapi.model.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto implements Serializable {

    private Long idPerson;
    private String firstName;
    private String lastName;
    private String cpf;
    private LocalDate birthDate;
    private List<PhoneDto> phones = new ArrayList<>();

    public PersonDto(Person entity) {
        idPerson = entity.getIdPerson();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        cpf = entity.getCpf();
        birthDate = entity.getBirthDate();
    }

    public PersonDto(Person entity, List<Phone> phones) {
        this(entity);
        phones.forEach(phone -> this.phones.add(new PhoneDto(phone)));
    }
}
