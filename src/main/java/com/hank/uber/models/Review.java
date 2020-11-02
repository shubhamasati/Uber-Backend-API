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
@Table(name = "review")
public class Review extends Auditable{
    private Integer ratingOutOfFive;
    private String note;
}
