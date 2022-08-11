package com.example.mobileskillupsession.ocp.good

import com.example.mobileskillupsession.ocp.PaymentType

class PayPalPayment: PaymentType {
    override fun processPayment(amount: Double) {
        println("PayPal Payment $amount")
    }
}