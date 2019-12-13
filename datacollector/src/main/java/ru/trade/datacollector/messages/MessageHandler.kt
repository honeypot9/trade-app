package ru.rit.pkt.order.messages

import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Component

// import ru.rit.pkt.api.ServiceStatus
// import ru.rit.pkt.api.model.OrderDto
// import ru.rit.pkt.api.model.PacketRequestDto
// import ru.rit.pkt.api.model.ServiceRequestCommandMessageDto
// import ru.rit.pkt.api.model.ServiceRequestDto
// import ru.rit.pkt.dto.OrderStatus
import ru.trade.init.util.QueuesNames
// import ru.rit.pkt.order.isBroadbandServiceInfo
// import ru.rit.pkt.order.service.OrderProcessingService
// import ru.rit.pkt.order.service.VolgaOrderProcessingService
// import java.util.*
//
@Component
class MessageHandler(
    Queues queues,
    DataCollectorProcessingService dataCProcessingService
) {
//     val logger: Logger = LoggerFactory.getLogger(MessageHandler::class.java) as Logger
//
//     @StreamListener(target = QueuesNames.INITIALISE_EVENT)
//     fun initialiseEventReceived(message: OrderDto?) {
//         logger.debug("message: $message")
//         logger.info("Получен запрос на подключение пакета. UUID: ${message?.id ?: ""}")
//
//         message ?: throw RuntimeException("message is null")
//
//         message.status = OrderStatus.IN_PROGRESS.value
//
//         // Create service requests for every service
//         message.packetRequest?.services?.forEach {
//             val serviceRequestDto = ServiceRequestDto()
//             serviceRequestDto.id = UUID.randomUUID()
//             serviceRequestDto.status = ServiceStatus.NEW.value
//             serviceRequestDto.serviceInfoId = it.id
//             it.addServiceRequestsItem(serviceRequestDto)
//         }
//
//         val orderDto = orderProcessingService.initialiseProcessing(message)
//
//         logger.info("Заявка ${orderDto.id}: валидация")
//         queues.validateCommand().send(MessageBuilder.withPayload(orderDto).build())
//     }
//
//     @StreamListener(target = QueuesNames.VALIDATE_EVENT)
//     fun validateEventReceived(message: OrderDto?) {
//         logger.debug("message: $message")
//         logger.info("Заявка ${message?.id ?: ""}: валидация успешно завершена")
//
//         message ?: throw RuntimeException("message is null")
//
//         val orderDto = orderProcessingService.validateProcessing(message)
//
//         // Obtain broadband services
//         val broadbandServices =
//             orderDto.packetRequest?.services?.filter { serviceInfoDto -> isBroadbandServiceInfo(serviceInfoDto) }
//
//         // TODO Here we attach only broadband service request to message but connecting broadband involves iptv service too
//         broadbandServices?.forEach { broadbandService ->
//             if (broadbandService.serviceRequests?.isNotEmpty() == true) {
//                 val serviceRequestCommandMessageDto = ServiceRequestCommandMessageDto()
//                 serviceRequestCommandMessageDto.packetRequest = orderDto.packetRequest
//                 val serviceRequestDto =
//                     broadbandService.serviceRequests?.get(0) ?: throw RuntimeException("serviceRequest is null!")
//                 // TODO In rare cases multiple service requests can exist. Realise proper one recognition.
//                 serviceRequestCommandMessageDto.serviceRequestId = serviceRequestDto.id
//
//                 // Send broadband connect command for each broadband service in request
//                 logger.info("Заявка ${orderDto.id}: отправка заявки на подключение ШПД+ИТВ")
//                 queues.connectBroadbandCommand()
//                     .send(MessageBuilder.withPayload(serviceRequestCommandMessageDto).build())
//             }
//         }
//
//         queues.createPacketInstanceCommand().send(MessageBuilder.withPayload(orderDto).build())
//     }
//
}
