package com.example.mobileskillupsession.ocp.good

import com.example.mobileskillupsession.ocp.PaymentType

class CashPayment: PaymentType {
    override fun processPayment(amount: Double) {
        println("Cash Payment $amount")
    }
}