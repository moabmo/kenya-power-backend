//package com.kenyapower.reportapp.repository;
//
//import com.kenyapower.reportapp.model.PowerFailureReport;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface PowerFailureReportRepository extends JpaRepository<PowerFailureReport, Long> {}

package com.kenyapower.reportapp.repository;

import com.kenyapower.reportapp.model.PowerFailureReport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PowerFailureReportRepository extends JpaRepository<PowerFailureReport, Long> {
    List<PowerFailureReport> findByCustomerId(String customerId);
}
