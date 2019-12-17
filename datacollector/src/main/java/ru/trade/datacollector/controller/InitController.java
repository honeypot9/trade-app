package ru.trade.datacollector.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.trade.datacollector_api.controller.InitApi;


@RestController
public class InitController implements InitApi {
    ResponseEntity<Void> fire(){
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }
}
