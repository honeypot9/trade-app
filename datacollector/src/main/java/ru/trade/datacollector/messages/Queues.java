//package ru.trade.datacollector.messages;
//
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.SubscribableChannel;
//
//
//interface Queues {
//    // Commands
//    @Input(QueuesNames.INIT_QUEUE)
//    fun validateCommand(): SubscribableChannel
//
//    @Output(QueuesNames.CONNECT_MVNO_EVENT)
//    fun connectMvnoEvent(): MessageChannel
//}
