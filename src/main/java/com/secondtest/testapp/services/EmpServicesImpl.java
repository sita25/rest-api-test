package com.secondtest.testapp.services;

import com.secondtest.testapp.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;


//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

@Transactional
public class EmpServicesImpl implements EmpServices {
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;
    @Override
    public void insertEmp(Employee emp) {

//        System.out.println(emp);

        entityManager.persist(emp);
    }

    @Override
    public Employee getAllEmp() {
//        System.out.println("Hi this is from empservicesimpl.java");
//        return entityManager.find(Employee.class,id);
//        entityManager.fin
        return null;
    }

    @Override
    public Employee getEmpById(int id) {

        return entityManager.find(Employee.class,id);
    }

    @Override
    public void deleteEmp() {

    }

    @Override
    public void editEmp() {

    }
}
