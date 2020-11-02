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
@Table(name = "passenger")
public class Passenger extends Auditable{

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    private String firstName;

    private String lastName;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Temporal(value = TemporalType.DATE)
    private Date dob;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings = new ArrayList<>();

    @OneToOne
    private ExactLocation work;

    @OneToOne
    private ExactLocation home;

    @OneToOne
    private ExactLocation lastKnownExactLocation;

}
