package com.customer.account.model

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

data class Customer(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,

    val name:String?,
    val surname:String?,

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    val account: Set<Account>?,

)
