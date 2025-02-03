package com.example.InvoiceService.controller;

import com.example.InvoiceService.model.EmployeeInvoice;
import com.example.InvoiceService.service.EmployeeInvoiceService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoices")
public class EmployeeInvoiceController {
    private final EmployeeInvoiceService invoiceService;

    public EmployeeInvoiceController(EmployeeInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeInvoice> generateInvoice(@PathVariable String employeeId) {
        try {
            EmployeeInvoice invoice = invoiceService.generateInvoice(employeeId);
            return ResponseEntity.ok(invoice);
        } catch (RuntimeException e) {
            // Return 404 if employee is not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/{employeeId}/pdf")
    public ResponseEntity<byte[]> generateInvoicePdf(@PathVariable String employeeId) {
        try {
            byte[] pdfData = invoiceService.generateInvoicePdf(employeeId);
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=invoice_" + employeeId + ".pdf")
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfData);
        } catch (RuntimeException e) {
            // Return 404 if employee invoice PDF generation fails
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
