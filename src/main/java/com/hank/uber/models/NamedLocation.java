package com.hank.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "namedlocation")
public class NamedLocation extends Auditable {

    @OneToOne
    private ExactLocation exactLocation;

    private String street;

    private String area;

    private String city;

    private String state;

    private String zipcode;

    private String country;
}
