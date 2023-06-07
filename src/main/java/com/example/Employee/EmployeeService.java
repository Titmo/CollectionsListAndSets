package com.example.Employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class EmployeeService {
    final int id = 10;

    List<EmployeeImpl> staff = new ArrayList<>(List.of(
            new EmployeeImpl("Чернов Д.И.", 135_845, 2),
            new EmployeeImpl("Григорьев М. Д.", 118_702, 3),
            new EmployeeImpl("Беляев Д. А.", 66_132, 4),
            new EmployeeImpl("Александров А. И.", 82_077, 4),
            new EmployeeImpl("Савина М. С.", 64_450, 5),
            new EmployeeImpl("Голубев А. А.", 224_679, 1),
            new EmployeeImpl("Белоусова Е. И.", 221_751, 2),
            new EmployeeImpl("Бычков Д. А.", 81_302, 1),
            new EmployeeImpl("Кузнецов П. С.", 131_841, 5),
            new EmployeeImpl("Комарова Е. И.", 180_025, 3)));
    public void addEmployee(EmployeeImpl employee) {
        if (id > 10) {

        } else {
            staff.add(employee);
        }
    }

}

