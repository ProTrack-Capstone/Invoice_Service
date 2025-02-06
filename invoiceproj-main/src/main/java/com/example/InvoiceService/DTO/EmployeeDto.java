package com.example.InvoiceService.DTO;

import jakarta.persistence.ElementCollection;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class EmployeeDto {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String designation;
    private String emailId;
    private String phoneNumber;
    private String skills;
    private Status status;
    private LocalDate joiningDate;
    private String experience;
    private String projectId;
    private String reportingManager;
    private String currentLocation;
    private String address;
    private String city;
    private String country;
    private Long currentSalary;
    private String bankName;
    private String accountNumber;
    private String panNumber;
    public enum Status {

        ASSIGNED,

        UNASSIGNED

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public EmployeeDto(String employeeId, String firstName, String lastName, String designation, String emailId, String phoneNumber, String skills, Status status, LocalDate joiningDate, String experience, String projectId, String reportingManager, String currentLocation, String address, String city, String country, Long currentSalary, String bankName, String accountNumber, String panNumber) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.skills = skills;
        this.status = status;
        this.joiningDate = joiningDate;
        this.experience = experience;
        this.projectId = projectId;
        this.reportingManager = reportingManager;
        this.currentLocation = currentLocation;
        this.address = address;
        this.city = city;
        this.country = country;
        this.currentSalary = currentSalary;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.panNumber = panNumber;
    }

    public EmployeeDto() {
    }
    //    private String employeeid;
//
//
//    private String name;
//
//
//    private String designation;
//
//
//    private String skills;
//
//
//    private Status status;
//
//    private LocalDate joiningDate;
//
//    // Assuming a foreign key to the project
//    private String projectId;
//
//
//    private Long currentSalary;
//
//
//    private String bankName;
//
//
//    private String accountNumber;
//
//
//    private String panNumber;
//
//    public enum Status {
//        ASSIGNED,
//        UNASSIGNED
//    }
//
//    public EmployeeDto(String employeeid, String name, String designation, String skills, Status status, LocalDate joiningDate, String projectId, Long currentSalary, String bankName, String accountNumber, String panNumber) {
//        this.employeeid = employeeid;
//        this.name = name;
//        this.designation = designation;
//        this.skills = skills;
//        this.status = status;
//        this.joiningDate = joiningDate;
//        this.projectId = projectId;
//        this.currentSalary = currentSalary;
//        this.bankName = bankName;
//        this.accountNumber = accountNumber;
//        this.panNumber = panNumber;
//    }
//
//    public String getEmployeeid() {
//        return employeeid;
//    }
//
//    public void setEmployeeid(String employeeid) {
//        this.employeeid = employeeid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    public LocalDate getJoiningDate() {
//        return joiningDate;
//    }
//
//    public void setJoiningDate(LocalDate joiningDate) {
//        this.joiningDate = joiningDate;
//    }
//
//    public String getProjectId() {
//        return projectId;
//    }
//
//    public void setProjectId(String projectId) {
//        this.projectId = projectId;
//    }
//
//    public Long getCurrentSalary() {
//        return currentSalary;
//    }
//
//    public void setCurrentSalary(Long currentSalary) {
//        this.currentSalary = currentSalary;
//    }
//
//    public String getBankName() {
//        return bankName;
//    }
//
//    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getPanNumber() {
//        return panNumber;
//    }
//
//    public void setPanNumber(String panNumber) {
//        this.panNumber = panNumber;
//    }
//
//    public EmployeeDto() {
//    }
}