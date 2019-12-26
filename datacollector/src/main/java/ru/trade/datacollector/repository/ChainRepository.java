package ru.trade.datacollector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.trade.datacollector.model.Chain;

import java.math.BigInteger;

public interface ChainRepository extends JpaRepository<Chain, Integer> {
    Chain findChainByAlias(BigInteger alais);
}
