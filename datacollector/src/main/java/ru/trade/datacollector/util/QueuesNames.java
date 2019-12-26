package ru.trade.datacollector.util;

public class QueuesNames {

    /**
     * Commands
     */

    //init calculate chain command
    public static final String INIT_COMMAND = "initChainCommand";

    //ext system chain request command
    public static final String  EXTSYSTEMCHAINREQ_COMMAND= "extSystemReqCommand";

    //ext system trade couple data request command
    public static final String  EXTSYSTEMCOUPLEREQ_COMMAND= "extSystemCoupleReqCommand";

    //chain profit calculation command
    public static final String  CHAINCALC_COMMAND= "chainCalcCommand";

    /**
     * Events
     */

    //init event
    public static final String INIT_EVENT = "initChainEvent";

    //ext system chain request event
    public static final String EXTSYSTEMCHAINREQ_EVENT = "extSystemChainReqEvent";

    //ext system trade couple data request event
    public static final String EXTSYSTEMCOUPLEREQ_EVENT = "extSystemCoupleReqEvent";

    //chain profit calculation event
    public static final String CHAINCALC_EVENT = "chainCalcEvent";
}
