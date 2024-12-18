package com.tekarch.fundtransferms.Service;

import com.tekarch.fundtransferms.DTO.AccountDTO;
import com.tekarch.fundtransferms.Models.Fundtransfer;
import com.tekarch.fundtransferms.Repositories.FundtransferRepository;
import com.tekarch.fundtransferms.Services.Interface.FundtransferService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FundtransferServiceImpl implements FundtransferService {

    private final FundtransferRepository fundtransferRepository;
    private final RestTemplate restTemplate;

    public FundtransferServiceImpl(FundtransferRepository fundtransferRepository, RestTemplate restTemplate) {
        this.fundtransferRepository = fundtransferRepository;
        this.restTemplate = restTemplate;
    }



    @Override
    public Fundtransfer crateTransaction(Fundtransfer transfer) {
        return fundtransferRepository.save(transfer);
    }

    @Override
    public Fundtransfer getTransactionById(long id) {
        return null;
    }

    @Override
    public AccountDTO getAccountDetails(Long accountId) {
        String accountServiceUrl = "http://localhost:8081/api/accounts/" + accountId;
        return restTemplate.getForObject(accountServiceUrl, AccountDTO.class);

    }

    public void transferFunds(Long sourceAccountId, Long destinationAccountId, BigDecimal amount) {
        // Get source account details
        AccountDTO sourceAccount = getAccountDetails(sourceAccountId);

        // Validate sufficient funds
        if (sourceAccount.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient funds");
        }

    }


    @Override
    public List<Fundtransfer> getAllTransactions() {
        return fundtransferRepository.findAll();
    }
}
