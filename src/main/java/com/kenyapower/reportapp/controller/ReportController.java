package com.kenyapower.reportapp.controller;

import com.kenyapower.reportapp.model.PowerFailureReport;
import com.kenyapower.reportapp.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")  // Allows frontend access from localhost:3000
@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)  // Ensures that a 201 Created status is returned
    public PowerFailureReport reportFailure(@RequestBody PowerFailureReport report) {
        return service.createReport(report);
    }

    @GetMapping("/{id}")
    public Optional<PowerFailureReport> getReport(@PathVariable Long id) {
        return service.getReportById(id);
    }

    @GetMapping
    public List<PowerFailureReport> getAllReports() {
        return service.getAllReports();
    }

    // New endpoint to get reports by customer ID
    @GetMapping("/customer/{customerId}")
    public List<PowerFailureReport> getReportsByCustomerId(@PathVariable String customerId) {
        return service.getReportsByCustomerId(customerId);
    }
}
