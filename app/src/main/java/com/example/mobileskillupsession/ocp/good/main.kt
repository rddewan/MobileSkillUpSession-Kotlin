package com.example.mobileskillupsession.ocp.good

fun main() {
    val payment = Payment()
    payment.makePayment(10.20, CashPayment())
    payment.makePayment(10.20, CreditPayment())
    payment.makePayment(10.20, PayPalPayment())
}