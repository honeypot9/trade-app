package ru.trade.datacollector.service;

import org.springframework.stereotype.Service;
import ru.trade.datacollector.model.Chain;
import ru.trade.datacollector.repository.ChainRepository;

import javax.transaction.Transactional;

@Service
public class ChainService {

    ChainRepository chainRepository;

//    @Transactional
//    public Chain createChain(Chain item){
//        Chain createdChain = new Chain();

//        chainService.save(item);
//
//    }

}
