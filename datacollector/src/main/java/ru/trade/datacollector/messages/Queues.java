package ru.trade.datacollector.messages;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import ru.trade.datacollector.util.QueuesNames;

public interface Queues {

    // Commands
    @Input(QueuesNames.INIT)
    public SubscribableChannel initChainProfitCalcCommand();

    @Output(QueuesNames.EXTSYSTEMCOUPLEREQ)
    public MessageChannel getChainDataFromExtSystemCommand();

}