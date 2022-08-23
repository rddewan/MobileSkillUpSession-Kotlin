package com.example.mobileskillupsession.dip.good

fun main() {
    val card = DebitCard()
    val pay = PaymentImp(card)
    pay.pay(10.20)

}