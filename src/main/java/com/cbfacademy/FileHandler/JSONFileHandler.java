package com.cbfacademy;

import com.cbfacademy.Employee.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONFileHandler {

    public static List<Employee> readFile(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try {
            File sourceFile = Paths.get(filePath).toFile();
            ObjectMapper objectMapper = new ObjectMapper();
            employees = Arrays.asList(objectMapper.readValue(sourceFile, Employee[].class));
            employees.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return employees;
    }

    public static void save(Employee employee, String outputFile) {
        // Add code to save the employee to the specified output file
    }

    public static void main(String[] args) {
        String filePath = "/Users/bimbo/Desktop/cbfacademy/java-json-exercise-Mor-gan/src/main/java/com/cbfacademy/Employee/Employee.java";
        List<Employee> employees = readFile(filePath);

    }
}