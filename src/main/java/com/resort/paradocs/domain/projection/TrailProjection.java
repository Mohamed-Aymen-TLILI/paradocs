package com.resort.paradocs.domain.projection;

import com.resort.paradocs.domain.Trail;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "trail", types = {Trail.class})
public interface TrailProjection {

    Long getId();

    String getName();

    String getDescription();
}
