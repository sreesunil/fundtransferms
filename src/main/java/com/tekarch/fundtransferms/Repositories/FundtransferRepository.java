package com.tekarch.fundtransferms.Repositories;

import com.tekarch.fundtransferms.Models.Fundtransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundtransferRepository  extends JpaRepository<Fundtransfer, Long> {
}
