package com.example.Employee;

public interface EmployeeService {
    Employee addPerson(String name, String lastName);

    Employee deletePerson(String name, String lastName);

    Employee findPerson(String name, String lastName);
}
