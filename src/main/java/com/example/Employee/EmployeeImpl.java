package com.example.Employee;

import java.util.Objects;


public class EmployeeImpl {
        private String fio;
        private int salary;
        private int department;
    private static int counter=0;
    private final int id;


    public EmployeeImpl(String fio, int salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        counter++;
        this.id = getCounter();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        EmployeeImpl.counter = counter;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImpl that = (EmployeeImpl) o;
        return salary == that.salary && department == that.department && Objects.equals(fio, that.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, salary, department);
    }

    @Override
    public String toString() {
        return "EmployeeImpl{" +
                "fio='" + fio + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }
}
