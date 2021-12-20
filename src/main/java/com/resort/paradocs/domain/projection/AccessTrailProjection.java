package com.resort.paradocs.domain.projection;

import com.resort.paradocs.domain.AccessTrail;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "accessTrail", types = {AccessTrail.class})
public interface AccessTrailProjection {

    Long getId();

    String getName();

    String getDescription();
}
