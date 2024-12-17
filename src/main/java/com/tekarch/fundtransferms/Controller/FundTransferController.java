package com.tekarch.fundtransferms.Controller;

import com.tekarch.fundtransferms.Models.Fundtransfer;
import com.tekarch.fundtransferms.Service.FundtransferServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FundTransferController {

    private final FundtransferServiceImpl fundtransferServiceImpl;


    public FundTransferController(FundtransferServiceImpl fundtransferServiceImpl) {
        this.fundtransferServiceImpl = fundtransferServiceImpl;


    }

    @GetMapping("/fundtransfer")
    public List<Fundtransfer> getAllTransactions(){
        return fundtransferServiceImpl.getAllTransactions();
    }

    @PostMapping("/fundtransfer")
    public ResponseEntity<?> createFundtransaction(@RequestBody Fundtransfer fundtransfer){

        return new ResponseEntity<>(fundtransferServiceImpl.crateTransaction(fundtransfer) , HttpStatus.CREATED) ;

    }

    @ExceptionHandler
    public ResponseEntity<?> respondWithError(Exception e){
        return new ResponseEntity<>("Exception Occurred. More Info :"
                + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
