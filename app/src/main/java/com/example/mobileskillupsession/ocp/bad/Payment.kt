package com.example.mobileskillupsession.ocp.bad

import com.example.mobileskillupsession.ocp.PaymentMode

class Payment {

    fun processPayment(amount: Double,payment: PaymentMode) {
        when(payment) {
            PaymentMode.CASH -> println("Pay in cash")
            PaymentMode.CREDIT -> println("Pay in credit")
            PaymentMode.PAYPAL -> println("Pay with PayPal")
        }
    }
}