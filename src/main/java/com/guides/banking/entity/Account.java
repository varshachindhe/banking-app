package com.guides.banking.entity;

import jakarta.persistence.*;
import lombok.*;

//Here hibernate will autmatically create table for Account JPA entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_holder_name")
    private String accountHolderName;
    private Double balance;
}
