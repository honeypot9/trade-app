package ru.trade.datacollector.service;

import ru.rit.pkt.product_inventory_api.dto.InitMessageDto;

public interface DataCollectorProcessingService {

    public InitMessageDto initProcessing(InitMessageDto message);

    public  ChainMessageDto tradeChainProcessing(ChainMessageDto message);

    public TradeCoupleMessageDto tradeCoupleProcessing(TradeCoupleMessageDto message);

}
