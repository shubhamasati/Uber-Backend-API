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
@Table(name = "otp")
public class OTP extends Auditable{

    private String otp;

    private String sentToNumber;

}
