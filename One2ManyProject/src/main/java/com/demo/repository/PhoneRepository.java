package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

}