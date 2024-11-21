package com.example.PaymentsGateway.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity

public class User {

    @Id
    int userId;

    String name;

    String email;

    Long accountNumber;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Transaction> transactions;
}
