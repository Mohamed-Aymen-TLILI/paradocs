package com.resort.paradocs.domain.projection;

import com.resort.paradocs.domain.Resort;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "resort", types = {Resort.class})
public interface ResortProjection {

    Long getId();

    String getName();

    String getDescription();
}
