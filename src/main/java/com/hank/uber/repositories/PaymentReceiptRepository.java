package com.hank.uber.repositories;

import com.hank.uber.models.PaymentReceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentReceiptRepository extends JpaRepository<PaymentReceipt, Long> {
}
