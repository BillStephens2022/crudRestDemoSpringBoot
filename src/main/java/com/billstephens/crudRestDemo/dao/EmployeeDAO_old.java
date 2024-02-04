package com.billstephens.crudRestDemo.dao;

import com.billstephens.crudRestDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO_old {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
