package com.resort.paradocs.integration;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CreateResortRequest {
    @NotNull
    @Size(max = 50)
    private String name;

    @NotNull
    private String description;
}
