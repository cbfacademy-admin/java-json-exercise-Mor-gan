package com.cbfacademy.Employee;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONFileHandler {

    public static List<Employee> readFile(String filePathString) {

        List<Employee> employees = new ArrayList<>();
        try {
            File sourceFile = Paths.get(filePathString).toFile();
            ObjectMapper objectMapper = new ObjectMapper();
            employees = Arrays.asList(objectMapper.readValue(sourceFile, Employee[].class));
            employees.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return employees;
    }

    public static void save(Employee employee, String outputFile) {
        List<Employee> employees = new ArrayList<>(); 
        try {
            employees.add(employee);
            File outputFileObj = Paths.get(outputFile).toFile();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(outputFileObj, employees);
            System.out.println("File created at: " + outputFile);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePathString = "/Users/bimbo/Desktop/cbfacademy/java-json-exercise-Mor-gan/src/main/resources/example.json";
        String outputFile = "/Users/bimbo/Desktop/cbfacademy/java-json-exercise-Mor-gan/src/main/java/com/cbfacademy/Outputfile.json";
        List<Employee> employees = JSONFileHandler.readFile(filePathString);
        if (!employees.isEmpty()) {
            Employee employeeToSave = employees.get(0); // Assuming you want to save the first employee
            JSONFileHandler.save(employeeToSave, outputFile);
        } System.out.println("File not created at: " + outputFile);
    }
}