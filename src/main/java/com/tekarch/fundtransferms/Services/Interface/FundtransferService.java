package com.tekarch.fundtransferms.Services.Interface;

import com.tekarch.fundtransferms.DTO.AccountDTO;
import com.tekarch.fundtransferms.Models.Fundtransfer;

import java.util.List;

public interface FundtransferService {

    Fundtransfer crateTransaction(Fundtransfer transfer);

    Fundtransfer getTransactionById(long id);
    public AccountDTO getAccountDetails(Long accountId);

    List<Fundtransfer> getAllTransactions();
}
