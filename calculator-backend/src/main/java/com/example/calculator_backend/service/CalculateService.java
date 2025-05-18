package com.example.calculator_backend.service;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@Service
public class CalculateService implements ICalculateService {

    @Override
    public String easyExpression(String input) {
        try {
            Expression expression = new ExpressionBuilder(input).build();
            double result = expression.evaluate();
            if (result == (int) result) {
                return String.valueOf((int) result);
            } else {
                return String.valueOf(result);
            }
        } catch (Exception e) {
            return "Error";
        }

    }
}
