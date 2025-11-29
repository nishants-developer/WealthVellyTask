package com.example.WealthVellyTask.WealthVellyTask.service;

import com.example.WealthVellyTask.WealthVellyTask.dto.InsuranceQuoteRequestDto;
import com.example.WealthVellyTask.WealthVellyTask.dto.InsuranceQuoteResponseDto;
import com.example.WealthVellyTask.WealthVellyTask.entity.InsuranceQuote;
import com.example.WealthVellyTask.WealthVellyTask.repository.InsuranceQuoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceQuoteServiceImpl implements InsuranceQuoteService{

    @Autowired
    private InsuranceQuoteRepo insuranceQuoteRepo;
    @Override
    public InsuranceQuoteResponseDto saveQuote(InsuranceQuoteRequestDto insuranceQuoteRequestDto) {

        InsuranceQuote quote = new InsuranceQuote();
        quote.setClientAge(insuranceQuoteRequestDto.getClientAge());
        quote.setCoverageAmount(insuranceQuoteRequestDto.getCoverageAmount());
        quote.setBasePremium(insuranceQuoteRequestDto.getBasePremium());

        double finalPremium = quote.getBasePremium();

        if (quote.getClientAge() != null && quote.getClientAge() < 30) {
            finalPremium = finalPremium * 0.90;   // 10% discount
        }

        if(quote.getCoverageAmount() != null && quote.getCoverageAmount() > 5000000){
            finalPremium = finalPremium * 1.05;
        }
        quote.setFinalPremium(finalPremium);

        InsuranceQuote save = insuranceQuoteRepo.save(quote);

        return toResponseDto(save);
    }

    @Override
    public InsuranceQuoteResponseDto getQuoteById(Long id) {
        return insuranceQuoteRepo.findById(id)
                .map(this::toResponseDto)
                .orElse(null);
    }

    private InsuranceQuoteResponseDto toResponseDto(InsuranceQuote quote) {
        return new InsuranceQuoteResponseDto(
                quote.getId(),
                quote.getClientAge(),
                quote.getCoverageAmount(),
                quote.getBasePremium(),
                quote.getFinalPremium()
        );
    }
}