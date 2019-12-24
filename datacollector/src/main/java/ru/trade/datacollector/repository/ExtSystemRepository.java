package ru.trade.datacollector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.trade.datacollector.model.ExtSystem;

public interface ExtSystemRepository extends JpaRepository<ExtSystem, Integer> {

    public ExtSystem findByAlias(String alias);

    public ExtSystem findByDescription(String alias);

}
