package com.example.InvoiceService.DTO;

import jakarta.persistence.ElementCollection;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class EmployeeDto {
    private String employeeid;


    private String name;


    private String designation;


    private String skills;


    private Status status;

    private LocalDate joiningDate;

    // Assuming a foreign key to the project
    private String projectId;


    private Long currentSalary;


    private String bankName;


    private String accountNumber;


    private String panNumber;

    public enum Status {
        ASSIGNED,
        UNASSIGNED
    }

    public EmployeeDto(String employeeid, String name, String designation, String skills, Status status, LocalDate joiningDate, String projectId, Long currentSalary, String bankName, String accountNumber, String panNumber) {
        this.employeeid = employeeid;
        this.name = name;
        this.designation = designation;
        this.skills = skills;
        this.status = status;
        this.joiningDate = joiningDate;
        this.projectId = projectId;
        this.currentSalary = currentSalary;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.panNumber = panNumber;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Long getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Long currentSalary) {
        this.currentSalary = currentSalary;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public EmployeeDto() {
    }
}