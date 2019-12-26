package ru.trade.datacollector.service;

import ru.trade.datacollector_api.dto.InitChainMessageDto;
import ru.trade.datacollector_api.dto.InitMessageDto;

public interface DataCollectorProcessingService {

    public void initChainProcessing(InitChainMessageDto message);

//    public  void tradeChainProcessing(ChainMessageDto message);
//
//    public void tradeCoupleProcessing(TradeCoupleMessageDto message);

}
