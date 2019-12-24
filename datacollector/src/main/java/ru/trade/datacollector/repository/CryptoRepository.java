package ru.trade.datacollector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.trade.datacollector.model.Crypto;

public interface CryptoRepository extends JpaRepository<Crypto, Integer>{

    public Crypto findByAlias(String alias);

    public Crypto findByDescription(String alias);

}
