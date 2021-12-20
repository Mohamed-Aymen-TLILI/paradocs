package com.resort.paradocs.unitaireTest;

import com.resort.paradocs.application.ResortApplicationService;
import com.resort.paradocs.controller.ResortController;
import com.resort.paradocs.domain.Resort;
import com.resort.paradocs.integration.CreateResortRequest;
import com.resort.paradocs.repository.ResortRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import lombok.Builder;

public class resortTestUnit {

    private ResortController resortController;
    private ResortApplicationService resortApplicationService;
    private Resort resort;

    @Mock
    private ResortRepository resortRepository;

    @BeforeEach
    private void  setUpEachTest() {
        MockitoAnnotations.initMocks(this);
        this.resortApplicationService = new ResortApplicationService(resortRepository);
        this.resortController = new ResortController(this.resortApplicationService);

        Resort rs1 = new Resort();
        rs1.setName("test");
        rs1.setId(1234l);
    }

    @Test
    void createResortTest() throws Exception {
        Resort rs = new Resort();
        rs.setName("nom");
        rs.setDescription("description");
        CreateResortRequest resort = new CreateResortRequest();
        resort.setName("test");
        resort.setDescription("description");
        this.resortApplicationService.createResort(resort.getName(), resort.getDescription());
        this.resortController.createResort(resort);
        verify(resortRepository).save(rs);


    }

    @Test
    void deleteResortTest() throws Exception {
        Resort res = Resort.builder().setName("test").setId(1234l).setDescription("description").build();
        this.resortController.deleteResort(1234l);
        verify(resortRepository).deleteById(1234l);
    }

}
