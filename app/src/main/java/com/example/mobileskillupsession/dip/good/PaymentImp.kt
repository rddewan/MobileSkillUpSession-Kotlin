package com.example.mobileskillupsession.dip.good

class PaymentImp(private val payment: ICardPayment) {

    fun pay(amount: Double) {
        payment.makePayment(amount)
    }
}