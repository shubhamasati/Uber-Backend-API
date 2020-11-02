package com.hank.uber.models;

import com.hank.uber.exceptions.InvalidDriverStutusActivityException;
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
@Table(name = "driver")
public class Driver extends Auditable {
    @OneToOne
    private Account account;

    private String firstName;

    private String lastName;

    private Gender gender;

    @OneToOne(mappedBy = "driver")
    private Car car;

    private String LicenseDetails;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Enumerated(EnumType.STRING)
    private DriverApprovalStatus approvalStatus;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();

    private Boolean isAvailable;

    private String activeCity;

    @OneToOne
    private ExactLocation lastKnownExactLocation;

    @OneToOne
    private ExactLocation home;



    public void setAvailable(Boolean available) {
        if (!approvalStatus.equals(DriverApprovalStatus.APPROVED)) {
            throw new InvalidDriverStutusActivityException("Driver " + getId() + "Approval is either Pending or Denied");
        }
        isAvailable = available;
    }
}
