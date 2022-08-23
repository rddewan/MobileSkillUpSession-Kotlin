package com.example.mobileskillupsession.dip.bad

fun main() {
    val card = CreditCard()
    val debitCard = DebitCard()
    val payment = CardPayment(debitCard)
    payment.payBill(10.20)
}