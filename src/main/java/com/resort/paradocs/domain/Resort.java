package com.resort.paradocs.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "RST")
@ToString(onlyExplicitlyIncluded = true)
public class Resort {
    @Id
    @Column(name = "IDRST")
    @GeneratedValue
    @ToString.Include
    private Long id;

    @Column(name = "NRST", unique = true)
    @ToString.Include
    private String name;

    @Column(name = "DRST")
    private String description;

    @OneToMany(mappedBy = "resort", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Lift> listLift = new ArrayList<>();

    public Resort (String name, String description) {
        this.name = name;
        this.description = description;
    }
}
