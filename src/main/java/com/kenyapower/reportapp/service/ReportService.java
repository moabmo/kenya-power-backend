package com.kenyapower.reportapp.service;

import com.kenyapower.reportapp.model.PowerFailureReport;
import com.kenyapower.reportapp.repository.PowerFailureReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    private PowerFailureReportRepository repository;

    public PowerFailureReport createReport(PowerFailureReport report) {
        report.setReportDate(LocalDateTime.now());
        report.setStatus("Pending");
        return repository.save(report);
    }

    public Optional<PowerFailureReport> getReportById(Long id) {
        return repository.findById(id);
    }

    public List<PowerFailureReport> getAllReports() {
        return repository.findAll();
    }

    // Method to get reports by customer ID
    public List<PowerFailureReport> getReportsByCustomerId(String customerId) {
        return repository.findByCustomerId(customerId);
    }
}
