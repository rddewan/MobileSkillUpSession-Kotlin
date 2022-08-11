package com.example.mobileskillupsession.ocp.bad

import com.example.mobileskillupsession.ocp.PaymentMode

fun main() {
    val payment = Payment();
    payment.processPayment(10.50,PaymentMode.CREDIT)
}