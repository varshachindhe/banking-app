package com.guides.banking.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
        private Long id;
        private String accountHolderName;
        private Double balance;

}
