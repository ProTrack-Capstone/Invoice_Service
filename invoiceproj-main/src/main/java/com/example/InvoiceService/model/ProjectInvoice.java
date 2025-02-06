package com.example.InvoiceService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ProjectInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // This will be used as the primary key for the project invoice.
    private String invoiceId;
    private String projectId;  // Unique identifier for the project
    private String projectName;  // Name of the project
    private BigDecimal totalAmount;  // Total amount for the project
    private BigDecimal taxAmount;  // Tax amount for the project
    private BigDecimal finalAmount;  // Final amount after tax
    private String clientName;  // Client associated with the project
    private String projectManager;  // Project manager handling the project
    private String projectStatus;  // Status of the project (e.g., ongoing, completed)
    private String PoNumber;
    private LocalDate IssueDate;
    private LocalDate DueDate;

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getPoNumber() {
        return PoNumber;
    }

    public void setPoNumber(String poNumber) {
        PoNumber = poNumber;
    }

    public LocalDate getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        IssueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return DueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        DueDate = dueDate;
    }

    public ProjectInvoice(Long id, String invoiceId, String projectId, String projectName, BigDecimal totalAmount, BigDecimal taxAmount, BigDecimal finalAmount, String clientName, String projectManager, String projectStatus, String poNumber, LocalDate issueDate, LocalDate dueDate) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.projectId = projectId;
        this.projectName = projectName;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
        this.finalAmount = finalAmount;
        this.clientName = clientName;
        this.projectManager = projectManager;
        this.projectStatus = projectStatus;
        PoNumber = poNumber;
        IssueDate = issueDate;
        DueDate = dueDate;
    }

    public ProjectInvoice() {
    }
}


//import jakarta.persistence.*;
//import jakarta.validation.constraints.*;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "project_invoices")
//public class ProjectInvoice {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    private String invoiceId;
//
//    private String projectId;
//
//
//    private String poNumber;
//
//
//    private String clientName;
//
//
//
//    private BigDecimal totalAmount;
//
//
//    private BigDecimal taxAmount;
//
//
//    private LocalDate issueDate;
//
//
//    private LocalDate dueDate;
//
//    // Getters and Setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
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
//    public String getInvoiceId() {
//        return invoiceId;
//    }
//
//    public void setInvoiceId(String invoiceId) {
//        this.invoiceId = invoiceId;
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
//    public String getPoNumber() {
//        return poNumber;
//    }
//
//    public void setPoNumber(String poNumber) {
//        this.poNumber = poNumber;
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
//    public BigDecimal getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(BigDecimal totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
//    public BigDecimal getTaxAmount() {
//        return taxAmount;
//    }
//
//    public void setTaxAmount(BigDecimal taxAmount) {
//        this.taxAmount = taxAmount;
//    }
//
//    public LocalDate getIssueDate() {
//        return issueDate;
//    }
//
//    public void setIssueDate(LocalDate issueDate) {
//        this.issueDate = issueDate;
//    }
//
//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }
//
//    public ProjectInvoice(Long id, String name, String invoiceId, String projectId, String poNumber, String clientName, BigDecimal totalAmount, BigDecimal taxAmount, LocalDate issueDate, LocalDate dueDate) {
//        this.id = id;
//        this.name = name;
//        this.invoiceId = invoiceId;
//        this.projectId = projectId;
//        this.poNumber = poNumber;
//        this.clientName = clientName;
//        this.totalAmount = totalAmount;
//        this.taxAmount = taxAmount;
//        this.issueDate = issueDate;
//        this.dueDate = dueDate;
//    }
//
//    public ProjectInvoice() {
//    }
//
//    @Override
//    public String toString() {
//        return "ProjectInvoice{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", invoiceId='" + invoiceId + '\'' +
//                ", projectId='" + projectId + '\'' +
//                ", poNumber='" + poNumber + '\'' +
//                ", clientName='" + clientName + '\'' +
//                ", totalAmount=" + totalAmount +
//                ", taxAmount=" + taxAmount +
//                ", issueDate=" + issueDate +
//                ", dueDate=" + dueDate +
//                '}';
//    }
//}
