package com.resort.paradocs.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRL")
@ToString(onlyExplicitlyIncluded = true)
public class Trail {

    @Id
    @Column(name = "IDTRL")
    @GeneratedValue
    @ToString.Include
    private Long id;

    @Column(name = "NTRL", unique = true)
    @ToString.Include
    private String name;

    @Column(name = "DTRL")
    private String description;
}
