package ru.trade.datacollector.messages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
import ru.trade.datacollector.model.Chain;
import ru.trade.datacollector.repository.ChainRepository;
import ru.trade.datacollector.repository.CryptoRepository;
import ru.trade.datacollector.service.DataCollectorProcessingService;
import ru.trade.datacollector.util.QueuesNames;
import ru.trade.datacollector_api.dto.InitChainMessageDto;
import ru.trade.datacollector_api.dto.TradeCoupleMessageDto;

import java.math.BigInteger;

@Component
public class MessageHandler {
    public Queues queues;
    public DataCollectorProcessingService dataCollectorProcessingService;
    public ChainRepository chainRepository;
    public CryptoRepository cryptoRepository;

    Logger logger = LoggerFactory.getLogger(MessageHandler.class);

    @StreamListener(target = QueuesNames.INIT_EVENT)
    public void initChainProcessing(InitChainMessageDto message){
        //TODO:add get chain id or create new chain in db
        logger.debug("Start initChainProcessing");
        logger.debug("Incoming message: " + message.toString());
        logger.debug("Create message for extSystemChainReq");
        //find chain by alias
        TradeCoupleMessageDto tmsg = new TradeCoupleMessageDto();
        Chain currentChain = chainRepository.findChainByAlias(new BigInteger(getChainAlias(message)));
        if(currentChain == null) {
            currentChain = new Chain();
            currentChain.alais = getChainAlias(message);
            currentChain.description = getChainDescription(message);
        }

    }

    public String getChainAlias(InitChainMessageDto message){
        String sAlias = message.getExtSystemId().toString();
        for(int i = 0; i < message.getChainElCount(); i++){
            sAlias += message.getChain().get(i);
        }
        return sAlias;
    }

    public String getChainDescription(InitChainMessageDto message) {
        String desc = "";
        for(int i=0; i < message.getChainElCount(); i++){
            desc += cryptoRepository.findById((Integer)message.getChain().get(i));
            if(i < message.getChainElCount()-1)
                desc += "->";
        }
        return desc;
    }
}
