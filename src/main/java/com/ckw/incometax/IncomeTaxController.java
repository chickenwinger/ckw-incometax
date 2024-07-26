package com.ckw.incometax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ckw/tax")
public class IncomeTaxController {
    @Autowired
    private TaxCalculator incomeTaxService;

    @PostMapping("/calculate")
    public IncomeTaxResponse calculateTax(@RequestBody IncomeTaxRequest request) {
        return incomeTaxService.calculateTax(request);
    }
}