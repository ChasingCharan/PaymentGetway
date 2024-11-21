package com.example.PaymentsGateway.controller;

import com.example.PaymentsGateway.model.Transaction;
import com.example.PaymentsGateway.model.User;
import com.example.PaymentsGateway.service.TransactionService;
import com.example.PaymentsGateway.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction){
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.addTransaction(transaction));
    }


    @GetMapping("/success-total/{userId}")
    public ResponseEntity<Double> getTotalSuccessAmount(@PathVariable int userId){
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.getTotalSuccessAmount(userId));
    }

    @DeleteMapping("/failed/")
    public ResponseEntity<String> deleteAllFailedTransactions(){
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.deleteAllFailedTransactions());
    }
}
