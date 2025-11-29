package com.example.WealthVellyTask.WealthVellyTask.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceQuoteResponseDto {

    private Long id;
    private Integer clientAge;
    private Double coverageAmount;
    private Double basePremium;
    private Double finalPremium;
}
