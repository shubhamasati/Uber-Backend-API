package com.hank.uber.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account extends Auditable{
    private String username;

    private String password;

    @ManyToMany
    private List<Role> role = new ArrayList<>();

}
