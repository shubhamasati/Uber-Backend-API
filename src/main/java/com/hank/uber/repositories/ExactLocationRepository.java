package com.hank.uber.repositories;

import com.hank.uber.models.ExactLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExactLocationRepository extends JpaRepository<ExactLocation, Long> {
}
