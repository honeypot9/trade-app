package ru.trade.datacollector.model;

import javax.persistence.*;

@Entity
@Table(name = "EXTSYSTEM")
public class ExtSystem {
    @Id
    @SequenceGenerator(name = "EXTSYSTEM_SEQ", sequenceName = "EXTSYSTEM_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXTSYSTEM_SEQ")
    @Column(name = "ID", nullable = false)
    public int id;

    @Column(name = "ALIAS", nullable = true)
    public String alais;

    @Column(name = "DESCRIPTION", nullable = true)
    public String description;
}