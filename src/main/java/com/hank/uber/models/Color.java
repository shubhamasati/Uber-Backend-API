package com.hank.uber.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "color")
public class Color extends Auditable{
    @Column(unique = true, nullable = false)
    private String name;

}
