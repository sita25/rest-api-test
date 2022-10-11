package com.secondtest.testapp.controller;

import com.secondtest.testapp.entity.Employee;
import com.secondtest.testapp.services.EmpServices;
import com.secondtest.testapp.services.EmpServicesImpl;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/insert")
public class InsertResource {
    @Inject
    private Employee emp;
    @Inject
    private EmpServices empServices;
    @POST
//    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertEmp(Employee em){
//        return em.toString();
//        System.out.println(em.getClass());
//        emp.setName("sita");
//        emp.setSalary(60000);
        System.out.println(em);
        empServices.insertEmp(em);
    }
}
