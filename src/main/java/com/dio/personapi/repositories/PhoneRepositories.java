package com.dio.personapi.repositories;

import com.dio.personapi.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepositories extends JpaRepository<Phone, Long> {
}
