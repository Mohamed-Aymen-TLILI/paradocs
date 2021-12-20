package com.resort.paradocs.repository;

import com.resort.paradocs.domain.Resort;
import com.resort.paradocs.domain.projection.ResortProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@RepositoryRestResource(excerptProjection = ResortProjection.class, path = "resort", collectionResourceRel = "resort")
public interface ResortRepository extends JpaRepository<Resort, Long> {

    @RestResource(path = "findById", rel= "findById")
    Optional<Resort> findById (@Param("id") Long id);

    @RestResource
    void deleteById (@NotNull Long id);
}
