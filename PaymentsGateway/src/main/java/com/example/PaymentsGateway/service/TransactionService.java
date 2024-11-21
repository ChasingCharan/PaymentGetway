package com.example.PaymentsGateway.service;

import com.example.PaymentsGateway.model.Transaction;
import com.example.PaymentsGateway.model.User;
import com.example.PaymentsGateway.repository.TransactionRepository;
import com.example.PaymentsGateway.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Double getTotalSuccessAmount(int userId) {
        return transactionRepository.findTotalAmountByUserId(userId);
    }

    public String deleteAllFailedTransactions() {
        transactionRepository.deleteAllFailedTransactions();
        return "Deleted All Failed Transactions Successfully";
    }
}
