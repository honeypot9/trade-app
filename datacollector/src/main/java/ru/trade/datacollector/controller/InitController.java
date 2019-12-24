package ru.trade.datacollector.controller;

import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.trade.datacollector.repository.CryptoRepository;
import ru.trade.datacollector.repository.ExtSystemRepository;
import ru.trade.datacollector.util.QueuesNames;
import ru.trade.datacollector_api.controller.InitApi;
import ru.trade.datacollector_api.dto.InitChainMessageDto;
import ru.trade.datacollector_api.dto.InitMessageDto;

import java.util.ArrayList;
import java.util.List;


@RestController
public class InitController implements InitApi {

    Logger logger = LoggerFactory.getLogger(InitController.class);

    CryptoRepository cryptoRepository;
    ExtSystemRepository extSystemRepository;

    @Override
    @PostMapping("/init")
    public ResponseEntity<Void> fire(@ApiParam(value = "init msg", required = true) @RequestBody InitMessageDto initMsg) {
        logger.debug("Start InitController.fire()");
        logger.debug("Payload:");
        logger.debug(initMsg.toString());
        logger.debug("Get data for init chain message");
        logger.debug("extSystemId: " + extSystemRepository.findByAlias(initMsg.getExtSystem()).id);
        InitChainMessageDto initChainMsg = new InitChainMessageDto();
        logger.debug("Cryptolist:");
        List<Object> chain = new ArrayList<Object>();
        for (int i = 0; i < initMsg.getChain().size(); i++){
            chain.add( cryptoRepository.findByAlias( (String) initMsg.getChain().get(i) ).id );
            logger.debug("name: " + initMsg.getChain().get(i));
            logger.debug("id: " + cryptoRepository.findByAlias( (String) initMsg.getChain().get(i) ).id);
        }
        initChainMsg.setExtSystemId(extSystemRepository.findByAlias(initMsg.getExtSystem()).id);
        initChainMsg.setChain(chain);
        //logger.debug("Put InitChainMessageDto message into " + QueuesNames.INIT + " queue");


        logger.debug("End InitController.fire()");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
