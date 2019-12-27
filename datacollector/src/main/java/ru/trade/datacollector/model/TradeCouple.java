package ru.trade.datacollector.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TRADE_COUPLE")
public class TradeCouple {
    @Id
    @SequenceGenerator(name = "TRADE_COUPLE_SEQ", sequenceName = "TRADE_COUPLE_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRADE_COUPLE_SEQ")
    @Column(name = "ID", nullable = false)
    public int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHAIN_ID")
    public Chain chain;

    @Column(name = "CRYPTOFIRST_ID", nullable = true)
    public Integer tradeCoupleFirstId;

    @Column(name = "CRYPTSECOND_ID", nullable = true)
    public Integer tradeCoupleSecondId;

    @Column(name = "BUYRATE", nullable = true)
    public BigDecimal buyRate;

    @Column(name = "BUYRATEPREVIOUS", nullable = true)
    public BigDecimal buyRatePrevious;

    @Column(name = "BUYVOLUME", nullable = true)
    public BigDecimal buyVolume;

    @Column(name = "BUYVOLUMEPREVIOUS", nullable = true)
    public BigDecimal buyVolumePrevious;

    @Column(name = "SELLRATE", nullable = true)
    public BigDecimal sellRate;

    @Column(name = "SELLRATEPREVIOUS", nullable = true)
    public BigDecimal sellRatePrevious;

    @Column(name = "SELLVOLUME", nullable = true)
    public BigDecimal sellVolume;

    @Column(name = "SELLVOLUMEPREVIOUS", nullable = true)
    public BigDecimal sellVolumePrevious;
}
