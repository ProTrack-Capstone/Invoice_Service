package com.example.InvoiceService.DTO;

import java.time.LocalDate;

public class ProjectDTO {
    private String projectId;
    private String name;
    private String projectDomain;
    private int numberOfEmployees;
    private String techStack;
    private String clientName;
    private Double budget;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectDomain() {
        return projectDomain;
    }

    public void setProjectDomain(String projectDomain) {
        this.projectDomain = projectDomain;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProjectDTO(String projectId, String name, String projectDomain, int numberOfEmployees, String techStack, String clientName, Double budget, LocalDate startDate, LocalDate endDate, String status) {
        this.projectId = projectId;
        this.name = name;
        this.projectDomain = projectDomain;
        this.numberOfEmployees = numberOfEmployees;
        this.techStack = techStack;
        this.clientName = clientName;
        this.budget = budget;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public ProjectDTO() {
    }
}
//    private String projectid;
//    private String name;
//    private String clientName;
//    private Double budget;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private String status;

//    public ProjectDTO() {}
//
//    public ProjectDTO(String projectid, String name, String clientName, Double budget, LocalDate startDate, LocalDate endDate, String status) {
//        this.projectid = projectid;
//        this.name = name;
//        this.clientName = clientName;
//        this.budget = budget;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.status = status;
//    }
//
//    public String getProjectId() {
//        return projectid;
//    }
//
//    public void setProjectId(String projectid) {
//        this.projectid = projectid;
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
//    public String getClientName() {
//        return clientName;
//    }
//
//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    public Double getBudget() {
//        return budget;
//    }
//
//    public void setBudget(Double budget) {
//        this.budget = budget;
//    }
//
//    public LocalDate getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(LocalDate startDate) {
//        this.startDate = startDate;
//    }
//
//    public LocalDate getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(LocalDate endDate) {
//        this.endDate = endDate;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//}
