package com.tekarch.fundtransferms.DTO;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class AccountDTO {

    private Long accountId;          // Unique ID for the account
    private Long userId;             // ID of the user who owns the account
    private String accountNumber;    // Account number (unique identifier)
    private String accountType;      // Type of account (e.g., savings, checking)
    private BigDecimal balance;      // Current balance in the account
    private String currency;         // Currency type (default: USD)


    public Comparable<BigDecimal> getBalance() {
        return balance;
    }




}




