package com.cbfacademy.Employee;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private List<String> roles;

    public Employee(@JsonProperty("id") int id,@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName, @JsonProperty("roles") List<String> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }
//stock manager, view the list of stock(), remove it if sold,
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id='" + id + '\'' +
                ", first name='" + firstName + '\'' +
                ", last name='" + lastName + '\'' +
                ", roles=" + String.join(", ", roles) +
                '}';
    }
}
