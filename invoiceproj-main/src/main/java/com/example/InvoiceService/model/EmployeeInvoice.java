package com.example.InvoiceService.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "employee_invoices")
public class EmployeeInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // internal ID for entity

    private String invoiceId;  // Custom invoice ID (e.g., INV-2004)

    private String employeeId;

    private String employeeName;

    private BigDecimal totalAmount; // Annual Salary

    private BigDecimal taxAmount; // Annual Tax

    private BigDecimal finalAmount; // Net Annual Amount after Tax

    private BigDecimal grossAmount; // Gross Annual Amount

    private String bankName;

    private String panNumber;

    private String bankAccountNumber;

    // Getters and Setters

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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    // Constructor
    public EmployeeInvoice(Long id, String invoiceId, String employeeId, String employeeName, BigDecimal totalAmount, BigDecimal taxAmount, BigDecimal finalAmount, BigDecimal grossAmount, String bankName, String panNumber, String bankAccountNumber) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
        this.finalAmount = finalAmount;
        this.grossAmount = grossAmount;
        this.bankName = bankName;
        this.panNumber = panNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public EmployeeInvoice() {
    }
}
