package com.example.mobileskillupsession.dip.bad

class CardPayment(private val card: DebitCard) {

    fun payBill(amount : Double){
        card.makePayment(amount)
    }
}