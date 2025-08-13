package com.prakash.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class ApplicationLoggerService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Application Name : " + execution.getVariable("applicationName"));
        System.out.println("Loan Amount : " + execution.getVariable("loanAmount"));
        System.out.println("User Details : " + execution.getVariable("userDetails"));
    }
}
