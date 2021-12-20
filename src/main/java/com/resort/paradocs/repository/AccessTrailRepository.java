package com.resort.paradocs.repository;

import com.resort.paradocs.domain.AccessTrail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessTrailRepository extends JpaRepository<AccessTrail, Long> {
}
