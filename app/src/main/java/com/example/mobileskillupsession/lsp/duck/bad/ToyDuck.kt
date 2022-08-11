package com.example.mobileskillupsession.lsp.bad

class ToyDuck: Duck() {
    override fun duckDuck() {
        super.duckDuck()
    }

    override fun swim() {
        //throw  Exception("Toy duck can not swim. ")
        println("Toy duck can not swim.")
    }
}