package com.billstephens.crudRestDemo.dao;

import com.billstephens.crudRestDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")
// the above annotation can be used to customize the endpoint .. (i.e. the default will be
// to pluralize Employee and the endpoint will be "/employees".  If we wanted to customize to
// "/members", we could use the above annotation to override the default behavior.
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it, no need to add any additional code in here
}
