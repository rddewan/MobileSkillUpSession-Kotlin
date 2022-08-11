package com.example.mobileskillupsession.ocp.good

import com.example.mobileskillupsession.ocp.PaymentType

class Payment {

    fun makePayment(amount: Double,type: PaymentType) {
        type.processPayment(amount)
    }
}