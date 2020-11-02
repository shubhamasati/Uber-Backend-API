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
@Table(name = "exactlocation")
public class ExactLocation extends Auditable{
    private String longitude;
    private String latitude;
}
