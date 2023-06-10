package com.example.Employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {
    final int id = 10;

    List<Employee> staff = new ArrayList<>(List.of(
            new Employee("Чернов","Данила"),
            new Employee("Григорьев", "Олег"),
            new Employee("Беляев", "Максим"),
            new Employee("Александров","Кирилл" )
            ));


    @Override
    public Employee addPerson(String name, String lastName) {
        Employee person = new Employee(name, lastName);
        if (staff.size() > id) {
            throw new EmployeeStorageIsFullException("Робочие места заняты");
        } else if (staff.contains(person)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже на работе");
        } else {
            staff.add(person);
            return staff.get(staff.indexOf(person));
        }
    }

    @Override
    public Employee deletePerson(String name, String lastName) {
        Employee person = new Employee(name, lastName);
        if (!staff.contains(person)) {
            throw new EmployeeNotFoundException("Такого сотрудника нет");
        } else {
            staff.remove(person);
            return person;
        }
    }


    @Override
    public Employee findPerson(String name, String lastName) {
        Employee person = new Employee(name, lastName);
        if (!staff.contains(person)) {
            throw new EmployeeNotFoundException("Такого сотрудника нет");
        } else {
            return person;
        }
    }
    @Override
    public List<Employee> showAllPersons() {
        return staff;
    }
}

