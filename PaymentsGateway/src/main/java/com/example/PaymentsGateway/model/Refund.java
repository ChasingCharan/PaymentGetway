package com.example.PaymentsGateway.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity

public class Refund {

    @Id
    int id;

    double amount;

    int userId;

    int transactionId;
}
