package ru.trade.datacollector.model;

import javax.persistence.*;

@Entity
@Table(name = "TRADE_COUPLE")
public class TradeCouple {
    @Id
    @SequenceGenerator(name = "TRADE_COUPLE_SEQ", sequenceName = "TRADE_COUPLE_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRADE_COUPLE_SEQ")
    @Column(name = "ID", nullable = false)
    public int id;

    @Column(name = "ALIAS", nullable = true)
    public String alais;

    @Column(name = "DESCRIPTION", nullable = true)
    public String description;
}
