package ru.trade.datacollector.model;

import javax.persistence.*;

@Entity
@Table(name = "CRYPTO")
public class Crypto {
    @Id
    @SequenceGenerator(name = "CRYPTO_SEQ", sequenceName = "CRYPTO_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CRYPTO_SEQ")
    @Column(name = "ID", nullable = false)
    public int id;

    @Column(name = "ALIAS", nullable = true)
    public String alias;

    @Column(name = "DESCRIPTION", nullable = true)
    public String description;
}
