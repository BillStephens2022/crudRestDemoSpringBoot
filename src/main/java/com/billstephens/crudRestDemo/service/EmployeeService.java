package com.billstephens.crudRestDemo.service;

import com.billstephens.crudRestDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int theId);

    Employee save(Employee theEmployee);
    void deleteById(int theId);

}
