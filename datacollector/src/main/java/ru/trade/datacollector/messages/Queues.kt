package ru.trade.init.messages

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel
import ru.trade.init.util.QueuesNames

//
// import org.springframework.cloud.stream.annotation.Input
// import org.springframework.cloud.stream.annotation.Output
// import org.springframework.messaging.MessageChannel
// import org.springframework.messaging.SubscribableChannel
// import ru.rit.pkt.messages.QueuesNames
//
interface Queues {
    // Commands
    @Output(QueuesNames.INIT_COMMAND)
    fun initCommand(): MessageChannel
//
//     @Output(QueuesNames.CONNECT_BROADBAND_COMMAND)
//     fun connectBroadbandCommand(): MessageChannel
//
//     // // Events
//     // @Input(QueuesNames.INITIALISE_EVENT)
//     // fun initialiseEvent(): SubscribableChannel
//     //
//     // @Input(QueuesNames.VALIDATE_EVENT)
//     // fun validateEvent(): SubscribableChannel
}