package com.example.WealthVellyTask.WealthVellyTask.service;

import com.example.WealthVellyTask.WealthVellyTask.dto.InsuranceQuoteRequestDto;
import com.example.WealthVellyTask.WealthVellyTask.dto.InsuranceQuoteResponseDto;

public interface InsuranceQuoteService {
    InsuranceQuoteResponseDto saveQuote(InsuranceQuoteRequestDto insuranceQuoteRequestDto);
    InsuranceQuoteResponseDto getQuoteById(Long id);
}
