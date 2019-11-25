//package ru.trade.datacollector.listener;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.cloud.stream.messaging.Sink;
//
//@SpringBootApplication
//@EnableBinding(Sink.class)
//public class DataCollectorListener {
//
//    public static void main(String[] args) {
//        SpringApplication.run(DataCollectorListener.class, args);
//    }
//
//    @StreamListener(target=Sink.INPUT)
//    public void logfast(String msg) {
//        System.out.println("Read message: " + msg);
//    }
//
//}
