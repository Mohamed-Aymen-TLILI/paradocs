package com.resort.paradocs.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ALT")
@ToString(onlyExplicitlyIncluded = true)
public class AccessTrail {

    @Id
    @Column(name = "IDALT")
    @GeneratedValue
    @ToString.Include
    private Long id;

    @OneToOne
    @JoinColumn(name = "IDLFT", insertable = false, updatable = false)
    private Lift lift;

    @OneToOne
    @JoinColumn(name = "IDTRL", insertable = false, updatable = false)
    private Trail trail;

    @Column(name = "NALT", unique = true)
    @ToString.Include
    private String name;

    @Column(name = "DALT")
    private String description;
}
