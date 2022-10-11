package com.secondtest.testapp.services;

import com.secondtest.testapp.entity.Employee;

public interface EmpServices {
    void insertEmp(Employee emp);
    Employee getAllEmp();
    Employee getEmpById(int id);
    void deleteEmp();
    void editEmp();
}
