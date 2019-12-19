package ru.trade.datacollector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rit.pkt.product_inventory_api.dto.InitMessageDto;
import ru.trade.datacollector_api.controller.InitApi;


@RestController
public class InitController implements InitApi {

    Logger logger = LoggerFactory.getLogger(InitController.class);

    @PostMapping("/init")
    ResponseEntity<Void> fire(@RequestBody InitMessageDto initMessage){
        logger.debug("Start InitController.fire()");
        logger.debug("Payload: "+initMessage.toString());
        logger.debug("End InitController.fire()");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }
}
