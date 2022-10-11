package com.secondtest.testapp.controller;


import com.secondtest.testapp.entity.Employee;
import com.secondtest.testapp.services.EmpServices;
import com.secondtest.testapp.services.EmpServicesImpl;

//import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

    private EmpServices empServices=new EmpServicesImpl();
    @GET
    @Produces("text/plain")
    public String hello() {
//        Employee employee=new Employee();
//        employee.setName("ram");
//        employee.setSalary(60000);
//        empServices.insertEmp(employee);
        return "Hi, employee inserted succesfully";
    }
}