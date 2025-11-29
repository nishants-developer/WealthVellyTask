package com.example.WealthVellyTask.WealthVellyTask.controller;


import com.example.WealthVellyTask.WealthVellyTask.dto.InsuranceQuoteRequestDto;
import com.example.WealthVellyTask.WealthVellyTask.dto.InsuranceQuoteResponseDto;
import com.example.WealthVellyTask.WealthVellyTask.service.InsuranceQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/insurance-quotes")
public class InsuranceQuoteController {

    @Autowired
    private InsuranceQuoteService insuranceQuoteService;

    @PostMapping
    public ResponseEntity<InsuranceQuoteResponseDto> addQuote(@RequestBody InsuranceQuoteRequestDto insuranceQuoteRequestDto){
        InsuranceQuoteResponseDto save = insuranceQuoteService.saveQuote(insuranceQuoteRequestDto);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsuranceQuoteResponseDto> getQuote(@PathVariable Long id){
        InsuranceQuoteResponseDto quote = insuranceQuoteService.getQuoteById(id);
        if(quote == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(quote);
    }

}
