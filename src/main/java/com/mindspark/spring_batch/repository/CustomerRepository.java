package com.mindspark.spring_batch.repository;

import com.mindspark.spring_batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {


}
