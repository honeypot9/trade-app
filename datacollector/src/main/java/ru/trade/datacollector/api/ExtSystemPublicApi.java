package ru.trade.datacollector.api;

import ru.trade.datacollector_api.dto.ExtSystemTradeCoupleRespMessageDto;
import ru.trade.datacollector_api.dto.TradeCoupleRespDataElDto;
import java.util.List;

public interface ExtSystemPublicApi {

    public  List<ExtSystemTradeCoupleRespMessageDto> getTradeCoupleInfo(List<TradeCoupleRespDataElDto> tradeCouples);
}
