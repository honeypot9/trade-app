package ru.trade.datacollector.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CHAIN")
public class Chain {
    @Id
    @SequenceGenerator(name = "CHAIN_SEQ", sequenceName = "CHAIN_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    public Integer id;

    @Column(name = "ALIAS", nullable = true)
    public BigInteger alias;

    @Column(name = "EXTSYSTEM_ID", nullable = true)
    public Integer extSystemId;

    @Column(name = "DESCRIPTION", nullable = true)
    public String description;

    @OneToMany
    public Set<TradeCouple> tradeCoupleRef = new HashSet<TradeCouple>();

    public Set<TradeCouple> getTradeCoupleRefs() {
        return tradeCoupleRef;
    }

    public void setTradeCoupleRefs(Set<TradeCouple> tradeCoupleRefs) {
        if (tradeCoupleRefs != null) {
            this.tradeCoupleRef.clear();
            this.tradeCoupleRef.addAll(tradeCoupleRefs);
        } else {
            this.tradeCoupleRef.clear();
        }
    }

}
