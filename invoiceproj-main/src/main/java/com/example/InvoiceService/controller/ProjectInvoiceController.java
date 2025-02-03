package com.example.InvoiceService.controller;

import com.example.InvoiceService.model.EmployeeInvoice;
import com.example.InvoiceService.model.ProjectInvoice;
import com.example.InvoiceService.service.ProjectInvoiceService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoice")
public class ProjectInvoiceController {

    private final ProjectInvoiceService invoiceService;

    public ProjectInvoiceController(ProjectInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<ProjectInvoice> generateInvoice(@PathVariable String projectId) {
        ProjectInvoice invoice = invoiceService.generateInvoice(String.valueOf(Long.valueOf(projectId)));
            return ResponseEntity.ok(invoice);
    }

    @GetMapping("/{projectId}/pdf")
    public ResponseEntity<byte[]> getInvoicePdf(@PathVariable String projectId) {
        // Generate the PDF from the service based on the projectId
        byte[] pdf = invoiceService.generateInvoicePdf(projectId);

        // Return the PDF as a downloadable attachment
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=invoice_project_" + projectId + ".pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }

}
