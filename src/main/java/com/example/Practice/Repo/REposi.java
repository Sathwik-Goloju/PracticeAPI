package com.example.Practice.Repo;

import com.example.Practice.Modelss.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REposi extends JpaRepository<Customer,Integer> {
}
