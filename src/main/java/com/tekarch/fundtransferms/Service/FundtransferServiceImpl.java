package com.tekarch.fundtransferms.Service;

import com.tekarch.fundtransferms.Models.Fundtransfer;
import com.tekarch.fundtransferms.Repositories.FundtransferRepository;
import com.tekarch.fundtransferms.Services.Interface.FundtransferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundtransferServiceImpl implements FundtransferService {

    private final FundtransferRepository fundtransferRepository;

    public FundtransferServiceImpl(FundtransferRepository fundtransferRepository) {
        this.fundtransferRepository = fundtransferRepository;
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
    public List<Fundtransfer> getAllTransactions() {
        return fundtransferRepository.findAll();
    }
}
