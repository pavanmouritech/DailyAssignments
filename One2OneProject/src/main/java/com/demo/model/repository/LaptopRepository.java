package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
