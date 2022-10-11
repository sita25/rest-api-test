package com.secondtest.testapp.controller;

import com.secondtest.testapp.entity.Employee;
import com.secondtest.testapp.services.EmpServices;

import javax.inject.Inject;
import javax.mail.internet.ContentType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/{id}")
public class GetempbyidResource {
    @Inject
    private EmpServices empServices;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("id") int empid){
        return empServices.getEmpById(empid);

    }
}
