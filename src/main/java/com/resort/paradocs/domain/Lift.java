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
@Table(name = "LFT")
@ToString(onlyExplicitlyIncluded = true)
public class Lift {

    @Id
    @Column(name = "IDLFT")
    @GeneratedValue
    @ToString.Include
    private Long id;

    @Column(name = "NLFT", unique = true)
    @ToString.Include
    private String name;

    @ManyToOne
    @JoinColumn(name = "IDRST")
    private Resort resort;

    @Column(name = "DLFT")
    private String description;

}
