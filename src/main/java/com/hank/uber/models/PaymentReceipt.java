package com.hank.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paymentreceipt")
public class PaymentReceipt extends Auditable{
    private Double amount;
    @ManyToOne
    private PaymentGateway paymentGateway;

    private String details;
}
