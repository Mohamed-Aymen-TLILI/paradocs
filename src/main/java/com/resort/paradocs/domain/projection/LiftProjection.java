package com.resort.paradocs.domain.projection;

import com.resort.paradocs.domain.Lift;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "lift", types = {Lift.class})
public interface LiftProjection {

    Long getId();

    String getName();

    String getDescription();
}
