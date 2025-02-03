package com.example.InvoiceService.service;

import com.example.InvoiceService.DTO.ProjectDTO;
import com.example.InvoiceService.model.ProjectInvoice;
import com.example.InvoiceService.repository.ProjectInvoiceRepository;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ProjectInvoiceService {

    private final ProjectInvoiceRepository projectInvoiceRepository;
    private final WebClient webClient;
    private final String projectServiceUrl;

    private static final Logger logger = Logger.getLogger(ProjectInvoiceService.class.getName());

    public ProjectInvoiceService(ProjectInvoiceRepository projectInvoiceRepository, WebClient.Builder webClientBuilder) {
        this.projectInvoiceRepository = projectInvoiceRepository;
        this.webClient = webClientBuilder.baseUrl("http://localhost:3031/api/projects/").build();
        this.projectServiceUrl = "{id}"; // using {id} as a placeholder in the URL
    }

    // Method to generate invoice
    public ProjectInvoice generateInvoice(String projectId) {
        ProjectDTO projectDTO = getProjectDetails(projectId);
        return saveOrUpdateProjectInvoice(projectDTO);
    }


    // Method to generate invoice PDF
    public byte[] generateInvoicePdf(String projectId) {
        ProjectInvoice invoice = generateInvoice(projectId);
        return createPdf(invoice);
    }

    // Method to fetch project details from external service
    private ProjectDTO getProjectDetails(String projectId) {
        ProjectDTO projectDTO = webClient.get()
                .uri(projectServiceUrl, projectId) // passing the projectId as a String
                .retrieve()
                .bodyToMono(ProjectDTO.class)
                .block();

        if (projectDTO == null) {
            throw new RuntimeException("Project not found for ID: " + projectId);
        }
        return projectDTO;
    }

    // Method to save or update the invoice
    private ProjectInvoice saveOrUpdateProjectInvoice(ProjectDTO projectDTO) {
        ProjectInvoice newInvoice = new ProjectInvoice();
        newInvoice.setInvoiceId("INV-" + System.currentTimeMillis());
        newInvoice.setProjectId(projectDTO.getProjectId());
        newInvoice.setClientName(projectDTO.getClientName());
        newInvoice.setPoNumber("PO-" + projectDTO.getProjectId());
        newInvoice.setTotalAmount(BigDecimal.valueOf(projectDTO.getBudget()));
        newInvoice.setTaxAmount(calculateTax(BigDecimal.valueOf(projectDTO.getBudget())));
        newInvoice.setIssueDate(LocalDate.now());
        newInvoice.setDueDate(LocalDate.now().plusDays(30));

        return projectInvoiceRepository.save(newInvoice);
    }

    // Method to calculate tax (18% GST)
    private BigDecimal calculateTax(BigDecimal amount) {
        final BigDecimal taxRate = BigDecimal.valueOf(0.18); // 18% GST
        return amount.multiply(taxRate);
    }

    // Method to create PDF for the invoice
    private byte[] createPdf(ProjectInvoice invoice) {
        try (PDDocument document = new PDDocument(); ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.beginText();
                contentStream.setLeading(15);
                contentStream.newLineAtOffset(50, 750);

                contentStream.showText("                  PROTRACKER ORGANIZATION                 ");
                contentStream.newLine();
                contentStream.newLine();
                // Adding invoice details
                contentStream.showText("Project Invoice For Clients");
                contentStream.newLine();
                contentStream.newLine();
                contentStream.showText(" FROM  : ");
                contentStream.newLine();
                contentStream.showText("    Company Name: PROTRACK");
                contentStream.newLine();
                contentStream.showText("    Address: PROTRACK CORPORATION , THIRUVANANTHAPURAM");
                contentStream.newLine();
                contentStream.showText("    Phone: +91 9443554122");
                contentStream.newLine();
                contentStream.showText("    Email: contact@protrack.com");
                contentStream.newLine();
                contentStream.showText("    Website: www.protrack.com");
                contentStream.newLine();
                contentStream.showText("-----------------------------");
                contentStream.newLine();
                contentStream.newLine();

                contentStream.newLine();
//                contentStream.showText("Project Id: " + invoice.getProjectId());
//                contentStream.newLine();

                contentStream.showText("Invoice Number: " + invoice.getInvoiceId());
                contentStream.newLine();
                contentStream.showText("Invoice Date: " + LocalDate.now());
                contentStream.newLine();
                contentStream.showText("Company Name: Economic crew proj solutions");
                contentStream.newLine();
                contentStream.showText("Total Amount: " + invoice.getTotalAmount());
                contentStream.newLine();
                contentStream.showText("Tax Amount (18% GST): " + invoice.getTaxAmount());
                contentStream.newLine();
                contentStream.showText("Project Status:  Completed");
                contentStream.newLine();
                contentStream.newLine();



                contentStream.showText("--------------------------------------------------------");
                contentStream.newLine();
                // Adding additional details
                contentStream.showText("For any inquiries, please contact:");
                contentStream.newLine();
                contentStream.showText("--------------------------------------------------------");
                contentStream.newLine();
                contentStream.newLine();
                contentStream.showText("Company Name: PROTRACK CORPORATION");
                contentStream.newLine();
                contentStream.showText("Phone: +91 9443554122");
                contentStream.newLine();
                contentStream.showText("Email: contact@protrack.com");
                contentStream.newLine();
                contentStream.showText("Website: www.protrack.com");
                contentStream.newLine();
                contentStream.newLine();
                contentStream.showText("Thank you for your collaboration!");
                contentStream.newLine();
                contentStream.newLine();
                contentStream.showText("--------------------------------------------------------");

                contentStream.endText();
            }

            document.save(outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            logger.severe("Failed to generate PDF: " + e.getMessage());
            throw new RuntimeException("Failed to generate PDF", e);
        }
    }
}
