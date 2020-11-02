package com.hank.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paymentgateway")
public class PaymentGateway extends Auditable{
    private String name;
}
