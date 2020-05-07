package com.jamesmhare.boxofficemanager.service;

import com.jamesmhare.boxofficemanager.model.Performance;
import com.jamesmhare.boxofficemanager.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PerformanceService {

    @Autowired
    PerformanceRepository performanceRepository;

    Performance findByPerformanceId(Long performanceId) {
        return performanceRepository.findByPerformanceId(performanceId);
    }

    Performance findByDate(Date date) {
        return performanceRepository.findByDate(date);
    }
    List<Performance> findByShowName(String showName) {
        return performanceRepository.findByShowName(showName);
    }

}
