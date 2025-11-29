package com.example.WealthVellyTask.WealthVellyTask.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceQuoteRequestDto {
    private Integer clientAge;
    private Double coverageAmount;
    private Double basePremium;
}
