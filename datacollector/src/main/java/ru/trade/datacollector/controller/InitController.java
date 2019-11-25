package ru.trade.datacollector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RestController;

@EnableBinding(Source.class)
@RestController
public class InitController {
    //refer to instance of bean that Stream adds to container
    @Autowired
    Source currentSource;



}
