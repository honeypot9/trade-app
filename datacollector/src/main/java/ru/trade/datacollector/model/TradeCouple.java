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

    @Column(name = "CHAINID", nullable = true)
    public Integer chainId;

    @Column(name = "PRIORITY", nullable = true)
    public Integer priority;

    @Column(name = "FIRSTCURRENCYID", nullable = true)
    private Integer firstCurrencyID;

    @Column(name = "FIRSTCURRENCYEXTSYSTEMID", nullable = true)
    private Integer firstCurrencyExtSystemId;

    @Column(name = "SECONDCURRENCYID", nullable = true)
    private Integer secondCurrencyID;

    @Column(name = "SECONDCURRENCYEXTSYSTEMID", nullable = true)
    private Integer secondCurrencyExtSystemId;

    @Column(name = "BUYRATE", nullable = true)
    private BigDecimal buyRate;

    @Column(name = "BUYRATEPREVIOUS", nullable = true)
    private BigDecimal buyRatePrevious;

    @Column(name = "SELLRATE", nullable = true)
    private BigDecimal sellRate;

    @Column(name = "SELLRATEPREVIOUS", nullable = true)
    private BigDecimal sellRatePrevious;

    @Column(name = "BUYVOLUME", nullable = true)
    private BigDecimal buyVolume;

    @Column(name = "BUYVOLUMEPREVIOUS", nullable = true)
    private BigDecimal buyVolumePrevious;

    @Column(name = "SELLVOLUME", nullable = true)
    private BigDecimal sellVolume;

    @Column(name = "SELLVOLUMEPREVIOUS", nullable = true)
    private BigDecimal sellVolumePrevious;

}
