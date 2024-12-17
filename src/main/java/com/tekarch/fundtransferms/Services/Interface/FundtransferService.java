package com.tekarch.fundtransferms.Services.Interface;

import com.tekarch.fundtransferms.Models.Fundtransfer;

import java.util.List;

public interface FundtransferService {

    Fundtransfer crateTransaction(Fundtransfer transfer);

    Fundtransfer getTransactionById(long id);

    List<Fundtransfer> getAllTransactions();
}
