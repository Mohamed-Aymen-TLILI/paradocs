package com.resort.paradocs.controller;

import com.resort.paradocs.application.ResortApplicationService;
import com.resort.paradocs.integration.CreateResortRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/rest/resort")
public class ResortController {
    private ResortApplicationService resortApplicationService;

    public ResortController(ResortApplicationService resortApplicationService) {this.resortApplicationService = resortApplicationService;}

    @PostMapping
    public void createResort(@RequestBody @Valid CreateResortRequest createResortRequest) {
        resortApplicationService.createResort(createResortRequest.getName(), createResortRequest.getDescription());
    }

    @DeleteMapping("/{id}")
    public void deleteResort(@PathVariable Long id) {resortApplicationService.deleteResort(id);}
}
