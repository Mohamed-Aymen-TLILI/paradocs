package com.resort.paradocs.application;

import com.resort.paradocs.domain.Lift;
import com.resort.paradocs.domain.Resort;
import com.resort.paradocs.repository.LiftRepository;
import com.resort.paradocs.repository.ResortRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ResortApplicationService {
    private ResortRepository resortRepository;
    private LiftRepository liftRepository;

    public void createResort(String name, String description) {
        Resort resort = new Resort(name, description);
        resortRepository.save(resort);

    }

    public void deleteResort(Long id) {
        Resort resort = resortRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        resortRepository.delete(resort);
    }

    public void updateResort(List<Long> ids, Long resortId) {
        Resort resort = resortRepository.findById(resortId).orElseThrow(EntityNotFoundException::new);
        List<Lift> lift = liftRepository.findAllById(ids);
        List<Lift> liftToDelete = resort.getListLift().stream().filter(l -> !lift.contains(l)).collect(Collectors.toList());
        resort.getListLift().removeIf(l -> liftToDelete.contains(l));
    }
}
