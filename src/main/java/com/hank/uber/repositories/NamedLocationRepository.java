package com.hank.uber.repositories;

import com.hank.uber.models.NamedLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NamedLocationRepository extends JpaRepository<NamedLocation, Long> {
}
