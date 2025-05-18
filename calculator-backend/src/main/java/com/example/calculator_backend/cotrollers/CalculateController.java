package com.example.calculator_backend.cotrollers;

import com.example.calculator_backend.DTO.ExpressionDTO;
import com.example.calculator_backend.service.CalculateService;
import org.apache.el.lang.ExpressionBuilder;
import org.springframework.web.bind.annotation.*;

import java.beans.Expression;

@RestController
@RequestMapping("calculates")
public class CalculateController {
    private CalculateService calculateService;

    public CalculateController(CalculateService calculateService){
        this.calculateService = calculateService;
    }

    @PostMapping("/easy")
    public String easyExpression(@RequestBody ExpressionDTO expression) {
        return calculateService.easyExpression(expression.getExpression());
    }
}