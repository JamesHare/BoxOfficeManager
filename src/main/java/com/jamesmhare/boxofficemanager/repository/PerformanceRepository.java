package com.jamesmhare.boxofficemanager.repository;

import com.jamesmhare.boxofficemanager.model.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {

    Performance findByPerformanceId(Long performanceId);
    Performance findByDate(Date date);
    List<Performance> findByShowName(String showName);

}
