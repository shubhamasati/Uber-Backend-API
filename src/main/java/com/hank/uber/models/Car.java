package com.hank.uber.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
public class Car extends Auditable{
    @OneToOne
    private Driver driver;

    @ManyToOne
    private Color color;

    private String brandAndModel;

    private String plateNo;

    @Enumerated(EnumType.STRING)
    private CarType carType;

}
