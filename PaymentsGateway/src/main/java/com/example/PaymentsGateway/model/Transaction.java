package com.example.PaymentsGateway.model;

import com.example.PaymentsGateway.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity

public class Transaction {

    @Id
    int transactionId;

    int userId;

    double amount;

    @Enumerated(EnumType.STRING)
    Status status;

    double amountDeducted;

    Timestamp time;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;

}
