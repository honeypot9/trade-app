package ru.trade.datacollector.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "CHAIN")
public class Chain {
    @Id
    @SequenceGenerator(name = "CHAIN_SEQ", sequenceName = "CHAIN_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CHAIN_SEQ")
    @Column(name = "ID", nullable = false)
    public int id;

    @Column(name = "ALIAS", nullable = true)
    public String alais;

    @Column(name = "DESCRIPTION", nullable = true)
    public String description;

}
