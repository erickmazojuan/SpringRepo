package com.choy.parking_lot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.choy.parking_lot.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
