package com.example.mobileskillupsession.ocp.good

import com.example.mobileskillupsession.ocp.PaymentType

class CreditPayment: PaymentType {
    override fun processPayment(amount: Double) {
        println("Credit payment $amount")
    }
}