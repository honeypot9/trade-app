package ru.trade.datacollector.service;


import ru.trade.datacollector_api.dto.TradeCoupleReqMessageDto;

public interface DataCollectorProcessingService {

    public void initChainProcessing(TradeCoupleReqMessageDto message);

//    public  void tradeChainProcessing(ChainMessageDto message);
//
//    public void tradeCoupleProcessing(TradeCoupleMessageDto message);

}
