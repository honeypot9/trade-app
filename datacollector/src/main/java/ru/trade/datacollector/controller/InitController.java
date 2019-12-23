package ru.trade.datacollector.controller;

import com.fasterxml.jackson.databind.JavaType;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import ru.trade.datacollector_api.controller.InitApi;
import ru.trade.datacollector_api.dto.InitMessageDto;


@RestController
public class InitController implements InitApi {

    Logger logger = LoggerFactory.getLogger(InitController.class);

    @Override
    @PostMapping("/init")
    public ResponseEntity<Void> fire(@ApiParam(value = "init msg", required = true) @RequestBody InitMessageDto initMsg) {
        logger.debug("Start InitController.fire()");
        logger.debug("Payload:");
        logger.debug(initMsg.toString());
        logger.debug("End InitController.fire()");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
