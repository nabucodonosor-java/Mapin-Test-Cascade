package com.dio.personapi.dto;

import com.dio.personapi.model.Phone;
import com.dio.personapi.model.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDto implements Serializable {

    private Long idPhone;
    private PhoneType type;
    private String number;

    public PhoneDto(Phone entity) {
        idPhone = entity.getIdPhone();
        type = entity.getType();
        number = entity.getNumber();
    }
}
