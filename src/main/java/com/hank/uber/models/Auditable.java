package com.hank.uber.models;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    @CreatedDate // By Hibernate
    @Temporal(value = TemporalType.TIMESTAMP) // By JPA
    private Date createdAt;

    @LastModifiedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auditable auditable = (Auditable) o;
        if (this == null || auditable == null) return false;
        return id.equals(auditable.id);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : Objects.hash(id);
    }

    //    @Override
//    public int hashCode() {
//        return id == null ? 0 : id.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof Auditable) {
//            Auditable auditableObj = (Auditable) obj;
//            if (id == null && obj == null) return true;
//            if (id == null || obj == null) return false;
//            return id == auditableObj.id;
//        } else {
//            return super.equals(obj);
//        }
//    }
}
