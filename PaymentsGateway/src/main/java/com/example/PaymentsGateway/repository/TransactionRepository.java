package com.example.PaymentsGateway.repository;

import com.example.PaymentsGateway.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    @Query("select sum(t.amount) from Transaction t where t.userId = :userId and t.status = 'SUCCESS'")
    Double findTotalAmountByUserId(int userId);

    @Query("Delete from Transaction t where t.status = 'FAILED'")
    void deleteAllFailedTransactions();
}
