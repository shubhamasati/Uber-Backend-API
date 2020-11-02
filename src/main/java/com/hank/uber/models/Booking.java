package com.hank.uber.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class Booking extends Auditable{

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private BookingType bookingType;

    @OneToOne
    private Review reviewByUser;

    @OneToOne
    private Review reviewByDriver;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @OneToMany
    private List<ExactLocation> route = new ArrayList<>();

    @OneToOne
    private PaymentReceipt paymentReceipt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistanceMeters;

    @OneToOne
    private OTP rideStartOtp;
}
