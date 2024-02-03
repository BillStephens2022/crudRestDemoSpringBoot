package com.billstephens.crudRestDemo.dao;

import com.billstephens.crudRestDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
