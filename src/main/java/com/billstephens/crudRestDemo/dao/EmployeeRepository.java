package com.billstephens.crudRestDemo.dao;

import com.billstephens.crudRestDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it, no need to add any additional code in here
}
