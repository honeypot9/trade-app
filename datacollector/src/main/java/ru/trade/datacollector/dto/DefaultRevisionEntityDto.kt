package ru.rit.pkt.product_inventory_api.dto

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 * @param messageId
 * @param groupId
 * @param priorityId
 * @param timestamp 
 * @param revisionDate 
 */
public class InitMessageDto (

        @JsonProperty("id") val id: kotlin.Int? = null,

        @JsonProperty("timestamp") val timestamp: kotlin.Long? = null,

        @JsonProperty("revisionDate") val revisionDate: java.time.OffsetDateTime? = null
) {

}

