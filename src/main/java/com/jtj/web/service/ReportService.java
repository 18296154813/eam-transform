package com.jtj.web.service;

import com.jtj.web.common.ResultDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public interface ReportService {

    ResultDto<Object> getOverall();

    ResultDto<Object> getBorrow(LocalDate startTime, LocalDate endTime);
}
